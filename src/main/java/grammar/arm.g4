grammar arm;


/*

The fundamental statement format and operand order follows that used by AArch32 UAL assemblers and disassemblers,
i.e. a single statement per source line, consisting of one or more optional program labels,
followed by an instruction mnemonic, then a destination register and one or more source operands separated by commas.

{label:*} {opcode {dest{, source1{, source2{, source3}}}}}
*/

INSTRUCTION: OPCODE
INSTRUCTION
    : LABEL
    : LABEL RTYPE
    :

STRING : "[^"]*";

NUMBER : DECIMAL
    |   HEXADECIMAL
    |   N_BASE
    ;
DECIMAL : #?-?[\d]*;
HEXADECIMAL : 0[xX][\da-fA-F]*;


RTYPE : MOV
    |   ...

DTYPE :

OP2 :

MOV : MOV
    | mov

ADD : ADD
    | add

CONDITION
    : EQ

EQ : [Ee][Qq];

// Addressing modes

baseRegisterOnly
    : '[' register ']'
    ;
baseRegisterPlusOffsetImm
    : '[' register {[,] IMM}
    ;
baseRegisterPlusOffsetReg
    : '[' register ',' register

register
    : b64REGISTER
    | b32REGISTER
    ;

//Primitives

IMM : #\d*;

b64REGISTER
    : [Xx]([1-2][0-9]|\d)
    | ;

b64GENPURPOSEREG : [Xx]([0-2]?[0-9]|30|31);
b32GENPURPOSEREG : [Ww]([0-2]?[0-9]|30|31);
b64ZEROREG : [Xx][Zz][Rr];
b32ZEROREG : [Ww][Zz][Rr];
b32SP: [Ww][Ss][Pp];

b64SP: [Xx][Ss][Pp];


b32REGISTER : [Ww]([1-2][0-9]|\d);

b32ZERO : [Ww][Zz][Rr];
b64ZERO : [

COMMENT : #.*;

LABEL : ^[\w]+:;