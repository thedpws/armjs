// Generated from armasm.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class armasmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, SYMBOL=14, ADC=15, ADD=16, CMP=17, 
		MUL=18, SUB=19, LSL=20, LSR=21, MOV=22, B=23, BL=24, BLR=25, BR=26, CBNZ=27, 
		CBZ=28, EQ=29, NE=30, MI=31, PL=32, VS=33, VC=34, GE=35, LT=36, GT=37, 
		LE=38, AL=39, LDP=40, LDPSW=41, LDUR=42, LDRB=43, LDR=44, STR=45, STUR=46, 
		STP=47, INT=48, NEWLINE=49, COMMENT=50, ID=51, WORD=52, WS=53;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_instruction = 2, RULE_reg = 3, RULE_addr = 4, 
		RULE_imm = 5, RULE_op2 = 6, RULE_cc = 7, RULE_string = 8, RULE_label = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "instruction", "reg", "addr", "imm", "op2", "cc", 
			"string", "label"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'X'", "'x'", "'W'", "'w'", "'='", "'['", "']'", "'#'", 
			"'+'", "'-'", "'\"'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "SYMBOL", "ADC", "ADD", "CMP", "MUL", "SUB", "LSL", "LSR", 
			"MOV", "B", "BL", "BLR", "BR", "CBNZ", "CBZ", "EQ", "NE", "MI", "PL", 
			"VS", "VC", "GE", "LT", "GT", "LE", "AL", "LDP", "LDPSW", "LDUR", "LDRB", 
			"LDR", "STR", "STUR", "STP", "INT", "NEWLINE", "COMMENT", "ID", "WORD", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "armasm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public armasmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(armasmParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==WS) {
				{
				{
				setState(20);
				line();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(armasmParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(armasmParser.WS, i);
		}
		public TerminalNode NEWLINE() { return getToken(armasmParser.NEWLINE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(armasmParser.COMMENT, 0); }
		public TerminalNode SYMBOL() { return getToken(armasmParser.SYMBOL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(28);
				label();
				}
			}

			setState(31);
			match(WS);
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADC:
			case ADD:
			case CMP:
			case MUL:
			case SUB:
			case LSL:
			case LSR:
			case MOV:
			case B:
			case BL:
			case BLR:
			case BR:
			case CBNZ:
			case CBZ:
			case LDP:
			case LDRB:
			case LDR:
			case STR:
			case STP:
				{
				setState(32);
				instruction();
				}
				break;
			case SYMBOL:
				{
				{
				setState(33);
				match(SYMBOL);
				setState(34);
				match(WS);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(35);
					string();
					}
				}

				}
				}
				break;
			case WS:
				break;
			default:
				break;
			}
			setState(40);
			match(WS);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(41);
				match(COMMENT);
				}
			}

			setState(44);
			match(WS);
			setState(45);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode ADC() { return getToken(armasmParser.ADC, 0); }
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public TerminalNode ADD() { return getToken(armasmParser.ADD, 0); }
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public TerminalNode CMP() { return getToken(armasmParser.CMP, 0); }
		public TerminalNode MUL() { return getToken(armasmParser.MUL, 0); }
		public TerminalNode SUB() { return getToken(armasmParser.SUB, 0); }
		public TerminalNode LSL() { return getToken(armasmParser.LSL, 0); }
		public ImmContext imm() {
			return getRuleContext(ImmContext.class,0);
		}
		public TerminalNode LSR() { return getToken(armasmParser.LSR, 0); }
		public TerminalNode MOV() { return getToken(armasmParser.MOV, 0); }
		public TerminalNode B() { return getToken(armasmParser.B, 0); }
		public TerminalNode ID() { return getToken(armasmParser.ID, 0); }
		public TerminalNode BL() { return getToken(armasmParser.BL, 0); }
		public TerminalNode BLR() { return getToken(armasmParser.BLR, 0); }
		public TerminalNode BR() { return getToken(armasmParser.BR, 0); }
		public TerminalNode CBNZ() { return getToken(armasmParser.CBNZ, 0); }
		public TerminalNode CBZ() { return getToken(armasmParser.CBZ, 0); }
		public CcContext cc() {
			return getRuleContext(CcContext.class,0);
		}
		public TerminalNode LDP() { return getToken(armasmParser.LDP, 0); }
		public AddrContext addr() {
			return getRuleContext(AddrContext.class,0);
		}
		public TerminalNode LDR() { return getToken(armasmParser.LDR, 0); }
		public TerminalNode LDRB() { return getToken(armasmParser.LDRB, 0); }
		public TerminalNode STR() { return getToken(armasmParser.STR, 0); }
		public TerminalNode STP() { return getToken(armasmParser.STP, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(ADC);
				setState(48);
				reg();
				setState(49);
				match(T__0);
				setState(50);
				reg();
				setState(51);
				match(T__0);
				setState(52);
				reg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(ADD);
				setState(55);
				reg();
				setState(56);
				match(T__0);
				setState(57);
				reg();
				setState(58);
				match(T__0);
				setState(59);
				op2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(CMP);
				setState(62);
				reg();
				setState(63);
				match(T__0);
				setState(64);
				op2();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(MUL);
				setState(67);
				reg();
				setState(68);
				match(T__0);
				setState(69);
				reg();
				setState(70);
				match(T__0);
				setState(71);
				reg();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(SUB);
				setState(74);
				reg();
				setState(75);
				match(T__0);
				setState(76);
				reg();
				setState(77);
				match(T__0);
				setState(78);
				op2();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				match(LSL);
				setState(81);
				reg();
				setState(82);
				match(T__0);
				setState(83);
				reg();
				setState(84);
				match(T__0);
				setState(87);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__2:
				case T__3:
				case T__4:
					{
					setState(85);
					reg();
					}
					break;
				case T__8:
					{
					setState(86);
					imm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				match(LSR);
				setState(90);
				reg();
				setState(91);
				match(T__0);
				setState(92);
				reg();
				setState(93);
				match(T__0);
				setState(94);
				reg();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				match(MOV);
				setState(97);
				reg();
				setState(98);
				match(T__0);
				setState(99);
				reg();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				match(B);
				setState(102);
				match(ID);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(103);
				match(BL);
				setState(104);
				match(ID);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(105);
				match(BLR);
				setState(106);
				reg();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(107);
				match(BR);
				setState(108);
				reg();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(109);
				match(CBNZ);
				setState(110);
				reg();
				setState(111);
				match(T__0);
				setState(112);
				match(ID);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(114);
				match(CBZ);
				setState(115);
				reg();
				setState(116);
				match(T__0);
				setState(117);
				match(ID);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(119);
				match(B);
				setState(120);
				cc();
				setState(121);
				match(ID);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(123);
				match(LDP);
				setState(124);
				reg();
				setState(125);
				match(T__0);
				setState(126);
				reg();
				setState(127);
				match(T__0);
				setState(128);
				addr();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(130);
				match(LDR);
				setState(131);
				reg();
				setState(132);
				match(T__0);
				setState(133);
				reg();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(135);
				match(LDRB);
				setState(136);
				reg();
				setState(137);
				match(T__0);
				setState(138);
				reg();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(140);
				match(STR);
				setState(141);
				reg();
				setState(142);
				match(T__0);
				setState(143);
				addr();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(145);
				match(STP);
				setState(146);
				reg();
				setState(147);
				match(T__0);
				setState(148);
				reg();
				setState(149);
				match(T__0);
				setState(150);
				addr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(armasmParser.INT, 0); }
		public RegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).enterReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).exitReg(this);
		}
	}

	public final RegContext reg() throws RecognitionException {
		RegContext _localctx = new RegContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(155);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(armasmParser.ID, 0); }
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public ImmContext imm() {
			return getRuleContext(ImmContext.class,0);
		}
		public AddrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).enterAddr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).exitAddr(this);
		}
	}

	public final AddrContext addr() throws RecognitionException {
		AddrContext _localctx = new AddrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addr);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__5);
				setState(158);
				match(ID);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__6);
				setState(160);
				reg();
				setState(161);
				match(T__0);
				setState(162);
				imm();
				setState(163);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImmContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(armasmParser.INT, 0); }
		public ImmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).enterImm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).exitImm(this);
		}
	}

	public final ImmContext imm() throws RecognitionException {
		ImmContext _localctx = new ImmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_imm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__8);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__10) {
				{
				setState(168);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(171);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op2Context extends ParserRuleContext {
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public ImmContext imm() {
			return getRuleContext(ImmContext.class,0);
		}
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).exitOp2(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_op2);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				reg();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				imm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CcContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(armasmParser.EQ, 0); }
		public TerminalNode NE() { return getToken(armasmParser.NE, 0); }
		public TerminalNode MI() { return getToken(armasmParser.MI, 0); }
		public TerminalNode PL() { return getToken(armasmParser.PL, 0); }
		public TerminalNode VS() { return getToken(armasmParser.VS, 0); }
		public TerminalNode VC() { return getToken(armasmParser.VC, 0); }
		public TerminalNode GE() { return getToken(armasmParser.GE, 0); }
		public TerminalNode LT() { return getToken(armasmParser.LT, 0); }
		public TerminalNode GT() { return getToken(armasmParser.GT, 0); }
		public TerminalNode LE() { return getToken(armasmParser.LE, 0); }
		public TerminalNode AL() { return getToken(armasmParser.AL, 0); }
		public CcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).enterCc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).exitCc(this);
		}
	}

	public final CcContext cc() throws RecognitionException {
		CcContext _localctx = new CcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << MI) | (1L << PL) | (1L << VS) | (1L << VC) | (1L << GE) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << AL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(armasmParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(armasmParser.WORD, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__11);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(180);
				match(WORD);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(armasmParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armasmListener ) ((armasmListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(188);
			match(ID);
			}
			setState(189);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u00c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\5\3 \n\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\'\n\3\5\3)\n\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4Z\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009b\n"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a8\n\6\3\7\3\7\5"+
		"\7\u00ac\n\7\3\7\3\7\3\b\3\b\5\b\u00b2\n\b\3\t\3\t\3\n\3\n\7\n\u00b8\n"+
		"\n\f\n\16\n\u00bb\13\n\3\n\3\n\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16"+
		"\20\22\24\2\5\3\2\4\7\3\2\f\r\3\2\37)\2\u00d5\2\31\3\2\2\2\4\37\3\2\2"+
		"\2\6\u009a\3\2\2\2\b\u009c\3\2\2\2\n\u00a7\3\2\2\2\f\u00a9\3\2\2\2\16"+
		"\u00b1\3\2\2\2\20\u00b3\3\2\2\2\22\u00b5\3\2\2\2\24\u00be\3\2\2\2\26\30"+
		"\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34"+
		"\3\2\2\2\33\31\3\2\2\2\34\35\7\2\2\3\35\3\3\2\2\2\36 \5\24\13\2\37\36"+
		"\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!(\7\67\2\2\")\5\6\4\2#$\7\20\2\2$&\7\67"+
		"\2\2%\'\5\22\n\2&%\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(\"\3\2\2\2(#\3\2\2\2"+
		"()\3\2\2\2)*\3\2\2\2*,\7\67\2\2+-\7\64\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2"+
		"\2./\7\67\2\2/\60\7\63\2\2\60\5\3\2\2\2\61\62\7\21\2\2\62\63\5\b\5\2\63"+
		"\64\7\3\2\2\64\65\5\b\5\2\65\66\7\3\2\2\66\67\5\b\5\2\67\u009b\3\2\2\2"+
		"89\7\22\2\29:\5\b\5\2:;\7\3\2\2;<\5\b\5\2<=\7\3\2\2=>\5\16\b\2>\u009b"+
		"\3\2\2\2?@\7\23\2\2@A\5\b\5\2AB\7\3\2\2BC\5\16\b\2C\u009b\3\2\2\2DE\7"+
		"\24\2\2EF\5\b\5\2FG\7\3\2\2GH\5\b\5\2HI\7\3\2\2IJ\5\b\5\2J\u009b\3\2\2"+
		"\2KL\7\25\2\2LM\5\b\5\2MN\7\3\2\2NO\5\b\5\2OP\7\3\2\2PQ\5\16\b\2Q\u009b"+
		"\3\2\2\2RS\7\26\2\2ST\5\b\5\2TU\7\3\2\2UV\5\b\5\2VY\7\3\2\2WZ\5\b\5\2"+
		"XZ\5\f\7\2YW\3\2\2\2YX\3\2\2\2Z\u009b\3\2\2\2[\\\7\27\2\2\\]\5\b\5\2]"+
		"^\7\3\2\2^_\5\b\5\2_`\7\3\2\2`a\5\b\5\2a\u009b\3\2\2\2bc\7\30\2\2cd\5"+
		"\b\5\2de\7\3\2\2ef\5\b\5\2f\u009b\3\2\2\2gh\7\31\2\2h\u009b\7\65\2\2i"+
		"j\7\32\2\2j\u009b\7\65\2\2kl\7\33\2\2l\u009b\5\b\5\2mn\7\34\2\2n\u009b"+
		"\5\b\5\2op\7\35\2\2pq\5\b\5\2qr\7\3\2\2rs\7\65\2\2s\u009b\3\2\2\2tu\7"+
		"\36\2\2uv\5\b\5\2vw\7\3\2\2wx\7\65\2\2x\u009b\3\2\2\2yz\7\31\2\2z{\5\20"+
		"\t\2{|\7\65\2\2|\u009b\3\2\2\2}~\7*\2\2~\177\5\b\5\2\177\u0080\7\3\2\2"+
		"\u0080\u0081\5\b\5\2\u0081\u0082\7\3\2\2\u0082\u0083\5\n\6\2\u0083\u009b"+
		"\3\2\2\2\u0084\u0085\7.\2\2\u0085\u0086\5\b\5\2\u0086\u0087\7\3\2\2\u0087"+
		"\u0088\5\b\5\2\u0088\u009b\3\2\2\2\u0089\u008a\7-\2\2\u008a\u008b\5\b"+
		"\5\2\u008b\u008c\7\3\2\2\u008c\u008d\5\b\5\2\u008d\u009b\3\2\2\2\u008e"+
		"\u008f\7/\2\2\u008f\u0090\5\b\5\2\u0090\u0091\7\3\2\2\u0091\u0092\5\n"+
		"\6\2\u0092\u009b\3\2\2\2\u0093\u0094\7\61\2\2\u0094\u0095\5\b\5\2\u0095"+
		"\u0096\7\3\2\2\u0096\u0097\5\b\5\2\u0097\u0098\7\3\2\2\u0098\u0099\5\n"+
		"\6\2\u0099\u009b\3\2\2\2\u009a\61\3\2\2\2\u009a8\3\2\2\2\u009a?\3\2\2"+
		"\2\u009aD\3\2\2\2\u009aK\3\2\2\2\u009aR\3\2\2\2\u009a[\3\2\2\2\u009ab"+
		"\3\2\2\2\u009ag\3\2\2\2\u009ai\3\2\2\2\u009ak\3\2\2\2\u009am\3\2\2\2\u009a"+
		"o\3\2\2\2\u009at\3\2\2\2\u009ay\3\2\2\2\u009a}\3\2\2\2\u009a\u0084\3\2"+
		"\2\2\u009a\u0089\3\2\2\2\u009a\u008e\3\2\2\2\u009a\u0093\3\2\2\2\u009b"+
		"\7\3\2\2\2\u009c\u009d\t\2\2\2\u009d\u009e\7\62\2\2\u009e\t\3\2\2\2\u009f"+
		"\u00a0\7\b\2\2\u00a0\u00a8\7\65\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5"+
		"\b\5\2\u00a3\u00a4\7\3\2\2\u00a4\u00a5\5\f\7\2\u00a5\u00a6\7\n\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a8\13\3\2\2"+
		"\2\u00a9\u00ab\7\13\2\2\u00aa\u00ac\t\3\2\2\u00ab\u00aa\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\62\2\2\u00ae\r\3\2\2"+
		"\2\u00af\u00b2\5\b\5\2\u00b0\u00b2\5\f\7\2\u00b1\u00af\3\2\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\17\3\2\2\2\u00b3\u00b4\t\4\2\2\u00b4\21\3\2\2\2\u00b5\u00b9"+
		"\7\16\2\2\u00b6\u00b8\7\66\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00bd\7\16\2\2\u00bd\23\3\2\2\2\u00be\u00bf\7\65\2\2\u00bf"+
		"\u00c0\7\17\2\2\u00c0\25\3\2\2\2\r\31\37&(,Y\u009a\u00a7\u00ab\u00b1\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}