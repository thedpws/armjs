.data
inputTemplate:        .asciz "%s"

askString:            .asciz "Enter a string: "
stringTemplate:       .asciz "Your string: %s\n"
lengthTemplate:       .asciz "Length is %d\n"

true:                 .asciz "Palindrome!\n"
false:                .asciz "Not palindrome!\n"

hi:                   .asciz "Hi!\n"

.text
.global main

main:
#Store fp and lr
            stp	      x29, x30, [sp, #-288]!
            mov       x29, sp

            #Prompt user for input
            ldr       x0, =askString
            bl        printf

            #Get input
            ldr       x0, =inputTemplate
            add       x1, x29, #24
            bl        scanf

            #Let length be val at [x29, #16]
            #Increment length until it points to null char
            str	      xzr, [x29, #16]
          	b	        check
increment:
            #Increment length by 1
          	ldr	      x0, [x29, #16]
          	add	      x0, x0, #1
          	str	      x0, [x29, #16]
check:
            #Calculate index of current character
          	sub	      x1, x29, #3808
          	ldr	      x0, [x29, #16]
          	add	      x0, x1, x0

            #Store character into w0
          	 ldrb	    w0, [x0, #3832]

            #If null, continue
          	cmp       w0, #0
          	bne	      increment

            #Print length
            ldr       x0, =lengthTemplate
            ldr       x1, [x29, #16]
            bl        printf

            #Call palindrome
            ldr	      x0, [x29, #16]
          	sub	      x1, x0, #1
          	add	      x0, x29, #24
          	mov	      x2, x1
          	mov       x1, #0
          	bl	      palindrome

            #Print x9
            mov       x0, x9
            mov       x1, #0
            bl        printf

            #Restore fp and sp
            ldp	x29, x30, [sp], #288

            #Exit
            b         exit

exit:       mov       x0, #0
            mov       x8, #93
            svc       #0

palindrome:
#x0 is input string
#x1 is begin index
#x2 is end index
            #Store fp and lr
            stp	      x29, x30, [sp, #-48]!

            #Store sp
            mov       x29, sp

            #Push x0, x1, x2 onto stack
            #string
            str	      x0, [x29, #40]
            #begin
            str	      x1, [x29, #32]
            #end
            str	      x2, [x29, #24]

            #If x1 >= x2, return true
            cmp	      x1, x2
            blt       else
            b         r_true
else:
            #Else

            #Calculate address of char at begin index
            ldr	      x0, [x29, #32]
            ldr	      x1, [x29, #40]
            #Address of input string + begin index
            add	      x0, x1, x0
            #Load begin character to w1
            ldrb	    w1, [x0]

            #Load end character into w0
            ldr	      x0, [x29, #24]
            ldr	      x2, [x29, #40]
            add	      x0, x2, x0
            ldrb	    w0, [x0]

            #If begin char != end char, return false
            cmp	      w1, w0
            bne	      r_false

            #Increment begin index
            ldr	      x0, [x29, #32]
            add	      x0, x0, #1
            str	      x0, [x29, #32]

            #Decrement end index
            ldr	      x0, [x29, #24]
            sub	      x0, x0, #1
            str	      x0, [x29, #24]

            #Prepare for recursion
            #Load end index into x2
            ldr	      x2, [x29, #24]
            #Load begin index into x1
            ldr	      x1, [x29, #32]
            #Load string address into x0
            ldr	      x0, [x29, #40]
            #Recurse
            bl	      palindrome
            #Return to caller
            b         end_recurse

r_false:
            #Set x9 to the FALSE string and end recursion
            ldr	      x9, =false
            b	        end_recurse

r_true:
            #Set x9 to the TRUE string and end recursion
            ldr	      x9, =true
            b         end_recurse

end_recurse:
            ldp	      x29, x30, [sp], #48
            br        x30
