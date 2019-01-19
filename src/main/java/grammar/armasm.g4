grammar armasm;

// Copy-pasted from https://stackoverflow.com/a/16844524/8812523 //

/* Rules */

program: line* EOF;
/*
line: SYMBOL NEWLINE
    | (label)? SYMBOL string
    | '.global main' NEWLINE
    | (label)? instruction (COMMENT)? NEWLINE
    | label SYMBOL string (COMMENT)? NEWLINE
    | SYMBOL NEWLINE
    | label NEWLINE
    | NEWLINE
    | COMMENT NEWLINE
    ;
*/
line: (label)? WS (instruction|(SYMBOL WS (string)?))? WS (COMMENT)? WS NEWLINE;
instruction
    : ADC reg ',' reg ',' reg
    | ADD reg ',' reg ',' op2
    | CMP reg ',' op2
    | MUL reg ',' reg ',' reg
    | SUB reg ',' reg ',' op2
    | LSL reg ',' reg ',' (reg | imm)
    | LSR reg ',' reg ',' reg
    | MOV reg ',' reg
    | B ID
    | BL ID
    | BLR reg
    | BR reg
    | CBNZ reg ',' ID
    | CBZ reg ',' ID
    | B cc ID
    | LDP reg ',' reg ',' addr
    | LDR reg ',' reg
    | LDRB reg ',' reg
    | STR reg ',' addr
    | STP reg ',' reg ',' addr
    ;

reg: ('X'|'x'|'W'|'w') INT ;

addr: '=' ID
    | '[' reg ',' imm ']'
    ;

imm: '#' ('+' | '-')? INT;

op2
    : reg
    | imm
    ;

cc
    : EQ
    | NE
    | MI
    | PL
    | VS
    | VC
    | GE
    | LT
    | GT
    | LE
    | AL
    ;
string: '"'(WORD)*'"';
SYMBOL : '.'[A-Za-z]+;
label : (ID)':';
/* Tokens */

/* Arithmetic */
ADC: ('ADC' ('S')? | 'adc' ('s')? ) ;
ADD: ('ADD' ('S')? | 'add' ('s')? ) ;
CMP: ('CMP') | 'cmp' ;
MUL: 'MUL' | 'mul';
SUB: 'SUB' | 'SUBS' | 'sub' | 'subs';

/* Logical and Move */
LSL: 'LSL' | 'lsl';
LSR: 'LSR' | 'lsr' ;
MOV: 'MOV' | 'mov';

/* Branch */
B: 'B' | 'b';
BL: 'BL' | 'bl' ;
BLR: 'BLR' | 'blr' ;
BR: 'BR' | 'br' ;
CBNZ: 'CBNZ' | 'cbnz' ;
CBZ: 'CBZ' | 'cbz' ;

/* Condition Codes (cc) */
EQ: 'EQ' | 'eq';
NE: 'NE' | 'ne';
MI: 'MI' | 'mi';
PL: 'PL' | 'pl';
VS: 'VS' | 'vs';
VC: 'VC' | 'vc';
GE: 'GE' | 'ge';
LT: 'LT' | 'lt';
GT: 'GT' | 'gt';
LE: 'LE' | 'le';
AL: 'AL' | 'al';

/* Load and Store */
LDP: 'LDP' | 'ldp';
LDPSW: 'LDSPW' | 'ldspw';
LDUR: 'LDUR' | 'ldur' ;
LDRB: 'LDRB' | 'ldrb' ;
LDR: 'LDR' | 'ldr' ;
STR: 'STR' | 'str' ;
STUR: 'STUR' | 'stur' ;
STP: 'STP' | 'stp' ;


INT: [0-9]+;

NEWLINE: [\n];

COMMENT: '#'.*?;

ID: [_A-Za-z]+;

WORD: [_A-Za-z\\ !?@#$%^&*()<>,.]+;

WS: [\t\r ]+ -> skip;
