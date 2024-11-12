package org.ton.intellij.asm

import org.ton.intellij.asm.AsmElementTypes.*
import org.ton.intellij.util.tokenSetOf

val ASM_INSTRUCTIONS = tokenSetOf(
    NOP,
    SWAP,
    XCHG0,
    XCHG,
    PUSHCTR,
    POPCTR,
    PUSH,
    DUP,
    OVER,
    POP,
    DROP,
    NIP,
    XCHG3,
    XCHG2,
    XCPU,
    PUXC,
    PUSH2,
    XCHG3_L,
    XC2PU,
    XCPUXC,
    XCPU2,
    PUXC2,
    PUXCPU,
    PU2XC,
    PUSH3,
    BLKSWAP,
    ROLL,
    ROLLREV,
    ROT2,
    ISNULL,
    NULL,
    PUSHNULL,
    TUPLE,
    NIL,
    SINGLE,
    PAIR,
    CONS,
    TRIPLE,
    INDEX,
    FIRST,
    CAR,
    SECOND,
    CDR,
    THIRD,
    UNTUPLE,
    UNSINGLE,
    UNPAIR,
    UNCONS,
    UNTRIPLE,
    UNPACKFIRST,
    CHKTUPLE,
    EXPLODE,
    SETINDEX,
    SETFIRST,
    SETSECOND,
    SETTHIRD,
    INDEXQ,
    FIRSTQ,
    CARQ,
    SECONDQ,
    CDRQ,
    THIRDQ,
    SETINDEXQ,
    SETFIRSTQ,
    SETSECONDQ,
    SETTHIRDQ,
    TUPLEVAR,
    INDEXVAR,
    UNTUPLEVAR,
    UNPACKFIRSTVAR,
    EXPLODEVAR,
    SETINDEXVAR,
    INDEXVARQ,
    SETINDEXVARQ,
    TLEN,
    QTLEN,
    ISTUPLE,
    LAST,
    TPUSH,
    COMMA,
    TPOP,
    NULLSWAPIF,
    NULLSWAPIFNOT,
    NULLROTRIF,
    NULLROTRIFNOT,
    NULLSWAPIF2,
    NULLSWAPIFNOT2,
    NULLROTRIF2,
    NULLROTRIFNOT2,
    INDEX2,
    CADR,
    CDDR,
    INDEX3,
    CADDR,
    CDDDR
)