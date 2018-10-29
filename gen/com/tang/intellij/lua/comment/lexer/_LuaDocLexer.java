/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.tang.intellij.lua.comment.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.tang.intellij.lua.comment.psi.LuaDocTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>doc.flex</tt>
 */
public class _LuaDocLexer implements FlexLexer, LuaDocTypes {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int xTAG = 2;
  public static final int xTAG_WITH_ID = 4;
  public static final int xTAG_NAME = 6;
  public static final int xCOMMENT_STRING = 8;
  public static final int xPARAM = 10;
  public static final int xTYPE_REF = 12;
  public static final int xCLASS = 14;
  public static final int xCLASS_EXTEND = 16;
  public static final int xFIELD = 18;
  public static final int xFIELD_ID = 20;
  public static final int xGENERIC = 22;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 14816 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\23\1\24\1\21\14\25\1\26\50\25\1\27\2\25\1\30\1\31\1\32\1\33"+
    "\25\25\1\34\20\21\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\21\1\44\1\45\1\46\1"+
    "\21\1\47\2\21\1\50\4\21\1\25\1\51\1\52\5\21\2\25\1\53\31\21\1\25\1\54\1\21"+
    "\1\55\40\21\1\56\17\21\1\57\1\60\1\61\1\62\13\21\1\63\10\21\123\25\1\64\7"+
    "\25\1\65\1\66\37\21\1\25\1\66\u0582\21\1\67\u017f\21");

  /* The ZZ_CMAP_Y table has 3584 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\0\1\5\1\6\2\7\1\10\1\11\1\12\1\13\1\14\1\15\3\0"+
    "\1\16\1\17\1\20\1\21\2\7\1\22\3\7\1\22\71\7\1\23\1\7\1\24\1\25\1\26\1\27\2"+
    "\25\16\0\1\30\1\16\1\31\1\32\2\7\1\33\11\7\1\34\21\7\1\35\1\36\23\7\1\25\1"+
    "\37\3\7\1\22\1\40\1\37\4\7\1\41\1\42\4\0\1\43\1\44\1\25\3\7\2\45\1\25\1\46"+
    "\1\47\1\0\1\50\5\7\1\51\3\0\1\52\1\53\13\7\1\54\1\43\1\55\1\56\1\0\1\57\1"+
    "\25\1\60\1\61\3\7\3\0\1\62\12\7\1\63\1\0\1\64\1\25\1\0\1\65\3\7\1\51\1\66"+
    "\1\21\2\7\1\63\1\67\1\70\1\71\2\25\3\7\1\72\10\25\1\73\1\26\6\25\1\74\2\0"+
    "\1\75\1\76\6\7\1\77\2\0\1\100\1\7\1\101\1\0\2\37\1\102\1\103\1\104\2\7\1\73"+
    "\1\105\1\106\1\107\1\110\1\60\1\111\1\101\1\0\1\112\1\47\1\102\1\113\1\104"+
    "\2\7\1\73\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\0\1\123\1\25\1\102\1"+
    "\34\1\33\2\7\1\73\1\124\1\106\1\43\1\125\1\126\1\25\1\101\1\0\1\40\1\25\1"+
    "\102\1\103\1\104\2\7\1\73\1\124\1\106\1\107\1\117\1\122\1\111\1\101\1\0\1"+
    "\40\1\25\1\127\1\130\1\131\1\132\1\133\1\130\1\7\1\134\1\135\1\136\1\137\1"+
    "\25\1\122\1\0\1\25\1\40\1\102\1\30\1\73\2\7\1\73\1\140\1\141\1\142\1\136\1"+
    "\143\1\24\1\101\1\0\2\25\1\144\1\30\1\73\2\7\1\73\1\140\1\106\1\142\1\136"+
    "\1\143\1\31\1\101\1\0\1\145\1\25\1\144\1\30\1\73\4\7\1\146\1\142\1\147\1\60"+
    "\1\25\1\101\1\0\1\25\1\36\1\144\1\7\1\22\1\36\2\7\1\33\1\150\1\22\1\151\1"+
    "\152\1\0\2\25\1\153\1\25\1\37\5\7\1\154\1\155\1\156\1\75\1\0\1\157\4\25\1"+
    "\160\1\161\1\162\1\37\1\163\1\164\1\154\1\165\1\166\1\167\1\0\1\170\4\25\1"+
    "\126\2\25\1\157\1\0\1\157\1\171\1\172\1\7\1\37\3\7\1\26\1\42\1\0\1\142\1\173"+
    "\1\0\1\42\3\0\1\46\1\174\7\25\5\7\1\51\1\0\1\175\1\0\1\157\1\63\1\176\1\177"+
    "\1\200\1\201\1\7\1\202\1\203\1\0\1\167\4\7\1\34\1\20\5\7\1\204\51\7\1\131"+
    "\1\22\1\131\5\7\1\131\4\7\1\131\1\22\1\131\1\7\1\22\7\7\1\131\10\7\1\205\4"+
    "\25\2\7\2\25\12\7\1\26\1\25\1\37\114\7\1\103\2\7\1\37\2\7\1\45\11\7\1\130"+
    "\1\126\1\25\1\7\1\30\1\206\1\25\2\7\1\206\1\25\2\7\1\207\1\25\1\7\1\30\1\210"+
    "\1\25\6\7\1\211\3\0\1\212\1\213\1\0\1\157\3\25\1\214\1\0\1\157\13\7\1\25\5"+
    "\7\1\215\10\7\1\216\1\25\3\7\1\26\1\0\1\2\1\0\1\2\1\122\1\0\3\7\1\216\1\26"+
    "\1\25\5\7\1\112\2\0\1\53\1\157\1\0\1\157\4\25\2\7\1\156\1\2\6\7\1\173\1\75"+
    "\3\0\1\107\1\0\1\157\1\0\1\157\1\41\13\25\1\217\5\7\1\211\1\0\1\217\1\112"+
    "\1\0\1\157\1\25\1\220\1\2\1\25\1\221\3\7\1\100\1\200\1\0\1\65\4\7\1\63\1\0"+
    "\1\2\1\25\4\7\1\211\2\0\1\25\1\0\1\222\1\0\1\65\3\7\1\216\12\25\1\223\2\0"+
    "\1\224\1\225\1\25\30\7\4\0\1\75\2\25\1\74\42\7\2\216\4\7\2\216\1\7\1\226\3"+
    "\7\1\216\6\7\1\30\1\166\1\227\1\26\1\230\1\112\1\7\1\26\1\227\1\26\1\25\1"+
    "\220\3\25\1\231\1\25\1\41\1\126\1\25\1\232\1\25\1\46\1\233\1\40\1\41\2\25"+
    "\1\7\1\26\3\7\1\45\2\25\1\0\1\46\1\234\1\0\1\235\1\25\1\236\1\36\1\150\1\237"+
    "\1\27\1\240\1\7\1\241\1\242\1\243\2\25\5\7\1\126\116\25\5\7\1\22\5\7\1\22"+
    "\20\7\1\26\1\244\1\245\1\25\4\7\1\34\1\20\7\7\1\41\1\25\1\60\2\7\1\22\1\25"+
    "\10\22\4\0\5\25\1\41\72\25\1\242\3\25\1\37\1\202\1\237\1\26\1\37\11\7\1\22"+
    "\1\246\1\37\12\7\1\204\1\242\4\7\1\216\1\37\12\7\1\22\2\25\3\7\1\45\6\25\170"+
    "\7\1\216\11\25\71\7\1\26\6\25\21\7\1\26\10\25\5\7\1\216\41\7\1\26\2\7\1\0"+
    "\1\245\2\25\5\7\1\156\1\74\1\247\3\7\1\60\12\7\1\157\3\25\1\41\1\7\1\36\14"+
    "\7\1\250\1\112\1\25\1\7\1\45\11\25\1\7\1\251\1\252\2\7\1\51\2\25\1\126\6\7"+
    "\1\112\1\25\1\65\5\7\1\211\1\0\1\46\1\25\1\0\1\157\2\0\1\65\1\47\1\0\1\65"+
    "\2\7\1\63\1\167\2\7\1\156\1\0\1\2\1\25\3\7\1\26\1\76\5\7\1\51\1\0\1\235\1"+
    "\41\1\0\1\157\4\25\5\7\1\100\1\75\1\25\1\252\1\253\1\0\1\157\2\7\1\22\1\254"+
    "\6\7\1\177\1\255\1\215\2\25\1\256\1\7\1\51\1\257\1\25\3\260\1\25\2\22\22\25"+
    "\4\7\1\51\1\261\1\0\1\157\64\7\1\112\1\25\2\7\1\22\1\262\5\7\1\112\40\25\55"+
    "\7\1\216\15\7\1\24\4\25\1\22\1\25\1\262\1\263\1\7\1\73\1\22\1\166\1\264\15"+
    "\7\1\24\3\25\1\262\54\7\1\216\2\25\10\7\1\36\6\7\5\25\1\7\1\26\2\0\2\25\1"+
    "\75\1\25\1\133\2\25\1\242\3\25\1\40\1\30\20\7\1\265\1\232\1\25\1\0\1\157\1"+
    "\37\2\7\1\113\1\37\2\7\1\45\1\266\12\7\1\22\3\36\1\267\1\270\2\25\1\271\1"+
    "\7\1\140\2\7\1\22\2\7\1\272\1\7\1\216\1\7\1\216\4\25\17\7\1\45\10\25\6\7\1"+
    "\26\20\25\1\273\20\25\3\7\1\26\6\7\1\126\5\25\3\7\1\22\2\25\3\7\1\45\6\25"+
    "\3\7\1\216\4\7\1\112\1\7\1\237\5\25\23\7\1\216\1\0\1\157\52\25\1\216\1\73"+
    "\4\7\1\34\1\274\2\7\1\216\25\25\2\7\1\216\1\25\3\7\1\24\10\25\7\7\1\266\10"+
    "\25\1\275\1\74\1\140\1\37\2\7\1\112\1\116\4\25\3\7\1\26\20\25\6\7\1\216\1"+
    "\25\2\7\1\216\1\25\2\7\1\45\21\25\11\7\1\126\66\25\1\221\6\7\1\0\1\75\3\25"+
    "\1\122\1\0\2\25\1\221\5\7\1\0\1\276\2\25\3\7\1\126\1\0\1\157\1\221\3\7\1\156"+
    "\1\0\1\142\1\0\10\25\1\221\5\7\1\51\1\0\1\277\1\25\1\0\1\157\24\25\5\7\1\51"+
    "\1\0\1\25\1\0\1\157\46\25\55\7\1\22\22\25\14\7\1\45\63\25\5\7\1\22\72\25\7"+
    "\7\1\126\130\25\10\7\1\26\1\25\1\100\4\0\1\75\1\25\1\60\1\221\1\7\14\25\1"+
    "\24\153\25\1\300\1\301\2\0\1\302\1\2\3\25\1\303\22\25\1\304\67\25\12\7\1\30"+
    "\10\7\1\30\1\305\1\306\1\7\1\307\1\140\7\7\1\34\1\310\2\30\3\7\1\311\1\166"+
    "\1\36\1\73\51\7\1\216\3\7\1\73\2\7\1\204\3\7\1\204\2\7\1\30\3\7\1\30\2\7\1"+
    "\22\3\7\1\22\3\7\1\73\3\7\1\73\2\7\1\204\1\312\6\0\1\140\3\7\1\160\1\37\1"+
    "\204\1\313\1\236\1\314\1\160\1\226\1\160\2\204\1\121\1\7\1\33\1\7\1\112\1"+
    "\315\1\33\1\7\1\112\50\25\32\7\1\22\5\25\106\7\1\26\1\25\33\7\1\216\74\25"+
    "\1\120\3\25\14\0\20\25\36\0\2\25");

  /* The ZZ_CMAP_A table has 1648 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\6\1\4\1\2\1\12\1\4\1\1\6\6\4\0\1\3\2\0\1\52\1\5\3\0\1\44\1\45\2\0\1\40"+
    "\1\11\1\7\1\0\2\6\1\37\1\0\1\42\1\0\1\43\1\0\1\10\22\5\1\50\1\0\1\51\1\0\1"+
    "\5\1\0\1\22\1\36\1\27\1\20\1\16\1\14\1\26\1\5\1\15\2\5\1\17\1\24\1\34\1\31"+
    "\1\21\1\5\1\23\1\30\1\33\1\32\1\25\2\5\1\35\1\5\1\46\1\41\1\47\1\0\6\6\1\13"+
    "\2\6\2\0\4\5\4\0\1\5\2\0\1\6\7\0\1\5\4\0\1\5\5\0\7\5\1\0\2\5\4\0\4\5\16\0"+
    "\5\5\7\0\1\5\1\0\1\5\1\0\5\5\1\0\2\5\6\0\1\5\1\0\3\5\1\0\1\5\1\0\4\5\1\0\13"+
    "\5\1\0\3\5\1\0\5\6\2\0\6\5\1\0\7\5\1\0\1\5\15\0\1\5\1\0\15\6\1\0\1\6\1\0\2"+
    "\6\1\0\2\6\1\0\1\6\3\5\5\0\5\6\6\0\1\5\4\0\3\6\5\0\3\5\7\6\4\0\2\5\1\6\13"+
    "\5\1\0\1\5\7\6\2\5\2\6\1\0\4\6\2\5\2\6\3\5\2\0\1\5\7\0\1\6\1\5\1\6\6\5\3\6"+
    "\2\0\11\5\3\6\1\5\6\0\2\6\6\5\4\6\2\5\2\0\2\6\1\5\11\6\1\5\3\6\1\5\5\6\2\0"+
    "\1\5\3\6\4\0\1\5\1\0\6\5\4\0\13\6\1\0\4\6\6\5\3\6\1\5\2\6\1\5\7\6\2\5\2\6"+
    "\2\0\2\6\1\0\3\6\1\0\10\5\2\0\2\5\2\0\6\5\1\0\1\5\3\0\4\5\2\0\1\6\1\5\7\6"+
    "\2\0\2\6\2\0\3\6\1\5\5\0\2\5\1\0\5\5\4\0\3\5\4\0\2\5\1\0\2\5\1\0\2\5\1\0\2"+
    "\5\2\0\1\6\1\0\5\6\4\0\2\6\2\0\3\6\3\0\1\6\7\0\4\5\1\0\1\5\7\0\4\6\3\5\1\6"+
    "\2\0\1\5\1\0\2\5\1\0\3\5\2\6\1\0\3\6\2\0\1\5\11\0\1\6\1\5\1\0\6\5\3\0\3\5"+
    "\1\0\4\5\3\0\2\5\1\0\1\5\1\0\2\5\3\0\2\5\3\0\2\5\4\0\5\6\3\0\3\6\1\0\4\6\2"+
    "\0\1\5\6\0\1\6\4\5\1\0\5\5\3\0\1\5\7\6\1\0\2\6\5\0\2\6\3\0\2\6\1\0\3\5\1\0"+
    "\2\5\5\0\3\5\2\0\1\5\3\6\1\0\4\6\1\5\1\0\4\5\1\0\1\5\4\0\1\6\4\0\6\6\1\0\1"+
    "\6\3\0\2\6\4\0\1\5\1\6\2\5\7\6\4\0\10\5\3\6\7\0\2\5\1\0\1\5\2\0\2\5\1\0\1"+
    "\5\2\0\1\5\6\0\4\5\1\0\3\5\1\0\1\5\1\0\1\5\2\0\2\5\1\0\3\5\2\6\1\0\2\6\1\5"+
    "\2\0\5\5\1\0\1\5\1\0\6\6\2\0\2\6\2\0\4\5\5\0\1\6\1\0\1\6\1\0\1\6\4\0\2\6\5"+
    "\5\3\6\6\0\1\6\1\0\7\6\1\5\2\6\4\5\3\6\1\5\3\6\2\5\7\6\3\5\4\6\5\5\14\6\1"+
    "\5\1\6\3\5\1\0\7\5\2\0\3\6\2\5\3\6\3\0\2\5\2\6\4\0\1\5\1\0\2\6\4\0\4\5\10"+
    "\6\3\0\1\5\3\0\2\5\1\6\5\0\3\6\2\0\1\5\1\6\1\5\5\0\6\5\2\0\5\6\3\5\3\0\10"+
    "\6\5\5\2\6\3\0\3\5\3\6\1\0\5\6\4\5\1\6\4\5\3\6\2\5\2\0\1\5\1\0\1\5\1\0\1\5"+
    "\1\0\1\5\2\0\3\5\1\0\6\5\2\0\2\5\2\12\5\6\5\0\1\5\5\0\6\6\1\0\1\6\3\0\4\6"+
    "\11\0\1\5\4\0\1\5\1\0\5\5\2\0\1\5\1\0\4\5\1\0\3\5\2\0\4\5\5\0\5\5\4\0\1\5"+
    "\4\0\4\5\3\6\2\5\5\0\2\6\2\0\3\5\6\6\1\0\2\5\2\0\4\5\1\0\2\5\1\6\3\5\1\6\4"+
    "\5\1\6\10\5\2\6\4\0\1\5\1\6\4\0\1\6\5\5\2\6\3\0\3\5\4\0\3\5\2\6\2\0\6\5\1"+
    "\0\3\6\1\0\2\6\5\0\5\5\5\0\1\5\1\6\3\5\1\0\2\5\1\0\7\5\2\0\1\6\6\0\2\5\2\0"+
    "\3\5\3\0\2\5\3\0\2\5\2\0\3\6\4\0\3\5\1\0\2\5\1\0\1\5\5\0\1\6\2\0\1\5\3\0\1"+
    "\5\2\0\2\5\3\6\1\0\2\6\1\0\3\6\2\0\1\6\2\0\1\6\4\5\10\0\5\6\3\0\6\6\2\0\3"+
    "\6\2\0\4\6\4\0\3\6\5\0\1\5\2\0\2\5\2\0\4\5\1\0\4\5\1\0\1\5\1\0\6\5\2\0\5\5"+
    "\1\0\4\5\1\0\4\5\2\0\2\6\1\0\1\5\1\0\1\5\5\0\1\5\1\0\1\5\1\0\3\5\1\0\3\5\1"+
    "\0\3\5");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\7\0\1\2\2\3\1\4\1\5\1\2"+
    "\1\6\2\7\1\10\1\11\1\12\1\13\14\14\1\1"+
    "\1\4\1\15\1\6\1\16\1\6\2\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\6"+
    "\1\30\1\31\1\15\1\32\1\33\1\34\1\35\15\14"+
    "\2\0\2\16\1\36\2\15\13\14\1\37\2\14\1\15"+
    "\1\16\1\40\1\16\3\15\14\14\1\41\1\16\3\15"+
    "\1\42\1\14\1\43\7\14\1\44\1\14\1\16\3\15"+
    "\3\14\1\45\1\46\1\47\1\50\2\14\1\51\2\15"+
    "\1\52\1\14\1\53\1\14\1\54\1\14\1\55\1\15"+
    "\1\56\1\14\1\57\1\15\1\60\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[162];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\u012d"+
    "\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204\0\u022f\0\u0204\0\u025a"+
    "\0\u0204\0\u0285\0\u0204\0\u02b0\0\u0204\0\u02db\0\u0204\0\u0204"+
    "\0\u0306\0\u0331\0\u035c\0\u0387\0\u03b2\0\u03dd\0\u0408\0\u0433"+
    "\0\u045e\0\u0489\0\u04b4\0\u04df\0\u050a\0\u0535\0\u0560\0\u058b"+
    "\0\u05b6\0\u05e1\0\u060c\0\u0637\0\u0662\0\u0204\0\u0204\0\u0204"+
    "\0\u0204\0\u0204\0\u0204\0\u0204\0\u0204\0\u0204\0\u068d\0\u06b8"+
    "\0\u0204\0\u06e3\0\u0204\0\u0204\0\u0204\0\u0285\0\u070e\0\u0739"+
    "\0\u0764\0\u078f\0\u07ba\0\u07e5\0\u0810\0\u083b\0\u0866\0\u0891"+
    "\0\u08bc\0\u08e7\0\u0912\0\u093d\0\u0968\0\u0993\0\u09be\0\u0204"+
    "\0\u09e9\0\u0a14\0\u0a3f\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb\0\u0b16"+
    "\0\u0b41\0\u0b6c\0\u0b97\0\u0bc2\0\u0bed\0\u0331\0\u0c18\0\u0c43"+
    "\0\u0204\0\u0204\0\u05e1\0\u0c6e\0\u0c99\0\u0cc4\0\u0cef\0\u0d1a"+
    "\0\u0d45\0\u0d70\0\u0d9b\0\u0dc6\0\u0df1\0\u0e1c\0\u0e47\0\u0e72"+
    "\0\u0e9d\0\u0ec8\0\u0ef3\0\u0331\0\u0f1e\0\u0f49\0\u0f74\0\u0f9f"+
    "\0\u0331\0\u0fca\0\u0331\0\u0ff5\0\u1020\0\u104b\0\u1076\0\u10a1"+
    "\0\u10cc\0\u10f7\0\u0331\0\u1122\0\u114d\0\u1178\0\u11a3\0\u11ce"+
    "\0\u11f9\0\u1224\0\u124f\0\u0331\0\u0331\0\u0331\0\u0331\0\u127a"+
    "\0\u12a5\0\u05e1\0\u12d0\0\u12fb\0\u058b\0\u1326\0\u0331\0\u1351"+
    "\0\u0331\0\u137c\0\u058b\0\u13a7\0\u0331\0\u13d2\0\u0331\0\u13fd"+
    "\0\u0331\0\u058b";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[162];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\15\1\16\1\17\2\20\3\15\1\21\1\22\2\23"+
    "\37\15\1\23\1\24\1\25\2\20\1\26\2\23\1\27"+
    "\3\23\23\26\13\23\1\30\1\23\1\24\1\25\2\20"+
    "\1\31\6\23\23\31\15\23\1\24\1\25\2\20\1\32"+
    "\6\23\1\33\2\32\1\34\1\32\1\35\1\32\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\32\1\45"+
    "\3\32\14\23\1\46\1\24\1\25\1\47\1\20\46\46"+
    "\1\23\1\24\1\25\2\20\1\50\1\23\1\51\4\23"+
    "\23\50\15\23\1\24\1\25\2\20\1\52\1\23\1\53"+
    "\1\27\3\23\1\54\10\52\1\55\11\52\1\56\1\57"+
    "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
    "\3\23\1\24\1\25\2\20\1\70\6\23\23\70\14\23"+
    "\1\15\1\24\1\25\2\20\32\15\1\71\13\15\1\23"+
    "\1\24\1\25\2\20\1\50\6\23\5\50\1\72\15\50"+
    "\15\23\1\24\1\25\2\20\1\50\6\23\23\50\14\23"+
    "\1\73\1\24\1\25\2\20\1\26\6\73\23\26\1\74"+
    "\1\75\12\73\55\0\1\17\53\0\2\20\57\0\1\76"+
    "\43\0\1\25\55\0\3\26\3\0\24\26\21\0\3\31"+
    "\3\0\24\31\21\0\3\32\3\0\24\32\21\0\3\32"+
    "\3\0\2\32\1\77\21\32\21\0\3\32\3\0\7\32"+
    "\1\100\14\32\21\0\3\32\3\0\7\32\1\101\1\102"+
    "\6\32\1\103\4\32\21\0\3\32\3\0\3\32\1\104"+
    "\20\32\21\0\3\32\3\0\16\32\1\105\5\32\21\0"+
    "\3\32\3\0\7\32\1\106\14\32\21\0\3\32\3\0"+
    "\3\32\1\107\20\32\21\0\3\32\3\0\4\32\1\110"+
    "\17\32\21\0\3\32\3\0\3\32\1\111\20\32\21\0"+
    "\3\32\3\0\12\32\1\112\11\32\21\0\3\32\3\0"+
    "\22\32\1\113\1\32\14\0\1\46\2\0\1\46\1\0"+
    "\47\46\2\0\1\47\1\20\46\46\5\0\3\50\3\0"+
    "\24\50\23\0\1\114\50\0\3\52\3\0\24\52\23\0"+
    "\1\115\50\0\3\52\3\0\17\52\1\116\4\52\21\0"+
    "\3\52\3\0\7\52\1\117\14\52\65\0\1\120\6\0"+
    "\3\70\3\0\24\70\21\0\3\50\3\0\10\50\1\121"+
    "\6\50\1\122\4\50\21\0\3\32\3\0\3\32\1\123"+
    "\20\32\21\0\3\32\3\0\21\32\1\124\2\32\21\0"+
    "\3\32\3\0\10\32\1\125\13\32\21\0\3\32\3\0"+
    "\2\32\1\126\13\32\1\127\5\32\21\0\3\32\3\0"+
    "\23\32\1\130\21\0\3\32\3\0\20\32\1\131\3\32"+
    "\21\0\3\32\3\0\5\32\1\132\16\32\21\0\3\32"+
    "\3\0\10\32\1\133\13\32\21\0\3\32\3\0\21\32"+
    "\1\134\2\32\21\0\3\32\3\0\7\32\1\135\14\32"+
    "\21\0\3\32\3\0\3\32\1\136\20\32\21\0\3\32"+
    "\3\0\3\32\1\137\20\32\21\0\3\32\3\0\6\32"+
    "\1\140\15\32\23\0\1\141\52\0\1\142\50\0\3\52"+
    "\3\0\21\52\1\143\2\52\21\0\3\52\3\0\10\52"+
    "\1\144\13\52\21\0\3\50\3\0\2\50\1\145\13\50"+
    "\1\146\5\50\21\0\3\50\3\0\23\50\1\147\21\0"+
    "\3\32\3\0\4\32\1\150\17\32\21\0\3\32\3\0"+
    "\13\32\1\151\10\32\21\0\3\32\3\0\7\32\1\152"+
    "\14\32\21\0\3\32\3\0\12\32\1\153\11\32\21\0"+
    "\3\32\3\0\20\32\1\154\3\32\21\0\3\32\3\0"+
    "\4\32\1\155\17\32\21\0\3\32\3\0\17\32\1\156"+
    "\4\32\21\0\3\32\3\0\17\32\1\157\4\32\21\0"+
    "\3\32\3\0\7\32\1\160\14\32\21\0\3\32\3\0"+
    "\3\32\1\161\20\32\21\0\3\32\3\0\15\32\1\162"+
    "\6\32\21\0\3\32\3\0\10\32\1\163\13\32\21\0"+
    "\3\32\3\0\3\32\1\164\20\32\21\0\3\52\3\0"+
    "\7\52\1\165\14\52\21\0\3\50\3\0\12\50\1\166"+
    "\11\50\21\0\3\50\3\0\20\50\1\167\3\50\21\0"+
    "\3\50\3\0\4\50\1\170\17\50\21\0\3\32\3\0"+
    "\5\32\1\171\16\32\21\0\3\32\3\0\17\32\1\172"+
    "\4\32\21\0\3\32\3\0\11\32\1\173\12\32\21\0"+
    "\3\32\3\0\7\32\1\174\14\32\21\0\3\32\3\0"+
    "\3\32\1\175\20\32\21\0\3\32\3\0\2\32\1\176"+
    "\21\32\21\0\3\32\3\0\10\32\1\177\13\32\21\0"+
    "\3\32\3\0\4\32\1\200\17\32\21\0\3\32\3\0"+
    "\10\32\1\201\13\32\21\0\3\32\3\0\10\32\1\202"+
    "\13\32\21\0\3\32\3\0\15\32\1\203\6\32\21\0"+
    "\3\32\3\0\4\32\1\204\17\32\21\0\3\52\3\0"+
    "\10\52\1\205\13\52\21\0\3\50\3\0\7\50\1\206"+
    "\14\50\21\0\3\50\3\0\3\50\1\207\20\50\21\0"+
    "\3\50\3\0\2\50\1\210\21\50\21\0\3\32\3\0"+
    "\7\32\1\211\14\32\21\0\3\32\3\0\20\32\1\212"+
    "\3\32\21\0\3\32\3\0\14\32\1\213\7\32\21\0"+
    "\3\32\3\0\14\32\1\214\7\32\21\0\3\32\3\0"+
    "\21\32\1\215\2\32\21\0\3\32\3\0\3\32\1\216"+
    "\20\32\21\0\3\32\3\0\13\32\1\217\10\32\21\0"+
    "\3\32\3\0\2\32\1\220\21\32\21\0\3\32\3\0"+
    "\16\32\1\221\5\32\21\0\3\52\3\0\13\52\1\222"+
    "\10\52\21\0\3\50\3\0\20\50\1\223\3\50\21\0"+
    "\3\50\3\0\14\50\1\224\7\50\21\0\3\50\3\0"+
    "\14\50\1\225\7\50\21\0\3\32\3\0\13\32\1\226"+
    "\10\32\21\0\3\32\3\0\3\32\1\227\20\32\21\0"+
    "\3\32\3\0\20\32\1\230\3\32\21\0\3\32\3\0"+
    "\14\32\1\231\7\32\21\0\3\32\3\0\7\32\1\232"+
    "\14\32\21\0\3\50\3\0\3\50\1\233\20\50\21\0"+
    "\3\50\3\0\20\50\1\234\3\50\21\0\3\32\3\0"+
    "\3\32\1\235\20\32\21\0\3\32\3\0\3\32\1\236"+
    "\20\32\21\0\3\32\3\0\5\32\1\237\16\32\21\0"+
    "\3\50\3\0\3\50\1\240\20\50\21\0\3\32\3\0"+
    "\5\32\1\241\16\32\21\0\3\50\3\0\5\50\1\242"+
    "\16\50\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5160];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\1\7\0\1\11\1\1\1\11\1\1\1\11"+
    "\1\1\1\11\1\1\1\11\1\1\2\11\25\1\11\11"+
    "\2\1\1\11\1\1\3\11\16\1\2\0\2\1\1\11"+
    "\20\1\2\11\100\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[162];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private int _typeLevel = 0;
    private boolean _typeReq = false;
    public _LuaDocLexer() {
        this((java.io.Reader) null);
    }

    private void beginType() {
        yybegin(xTYPE_REF);
        _typeLevel = 0;
        _typeReq = true;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _LuaDocLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(YYINITIAL); return STRING;
            } 
            // fall through
          case 50: break;
          case 2: 
            { yybegin(xCOMMENT_STRING); yypushback(yylength());
            } 
            // fall through
          case 51: break;
          case 3: 
            { yybegin(YYINITIAL); return com.intellij.psi.TokenType.WHITE_SPACE;
            } 
            // fall through
          case 52: break;
          case 4: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            } 
            // fall through
          case 53: break;
          case 5: 
            { yybegin(xTAG_NAME); return AT;
            } 
            // fall through
          case 54: break;
          case 6: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 55: break;
          case 7: 
            { yybegin(YYINITIAL);return com.intellij.psi.TokenType.WHITE_SPACE;
            } 
            // fall through
          case 56: break;
          case 8: 
            { return ID;
            } 
            // fall through
          case 57: break;
          case 9: 
            { yybegin(xCOMMENT_STRING); return STRING_BEGIN;
            } 
            // fall through
          case 58: break;
          case 10: 
            { return SHARP;
            } 
            // fall through
          case 59: break;
          case 11: 
            { yybegin(xCOMMENT_STRING); return ID;
            } 
            // fall through
          case 60: break;
          case 12: 
            { yybegin(xCOMMENT_STRING); return TAG_NAME;
            } 
            // fall through
          case 61: break;
          case 13: 
            { beginType(); return ID;
            } 
            // fall through
          case 62: break;
          case 14: 
            { if (_typeReq || _typeLevel > 0) { _typeReq = false; return ID; } else { yybegin(xCOMMENT_STRING); yypushback(yylength()); }
            } 
            // fall through
          case 63: break;
          case 15: 
            { _typeReq = true; return EXTENDS;
            } 
            // fall through
          case 64: break;
          case 16: 
            { _typeReq = true; return COMMA;
            } 
            // fall through
          case 65: break;
          case 17: 
            { _typeReq = true; return OR;
            } 
            // fall through
          case 66: break;
          case 18: 
            { _typeLevel++; return LT;
            } 
            // fall through
          case 67: break;
          case 19: 
            { _typeLevel--; _typeReq = false; return GT;
            } 
            // fall through
          case 68: break;
          case 20: 
            { _typeLevel++; return LPAREN;
            } 
            // fall through
          case 69: break;
          case 21: 
            { _typeLevel--; _typeReq = false; return RPAREN;
            } 
            // fall through
          case 70: break;
          case 22: 
            { _typeLevel++; return LCURLY;
            } 
            // fall through
          case 71: break;
          case 23: 
            { _typeLevel--; _typeReq = false; return RCURLY;
            } 
            // fall through
          case 72: break;
          case 24: 
            { yybegin(xCLASS_EXTEND); return ID;
            } 
            // fall through
          case 73: break;
          case 25: 
            { beginType(); return EXTENDS;
            } 
            // fall through
          case 74: break;
          case 26: 
            { yybegin(YYINITIAL); yypushback(yylength());
            } 
            // fall through
          case 75: break;
          case 27: 
            { return EXTENDS;
            } 
            // fall through
          case 76: break;
          case 28: 
            { return COMMA;
            } 
            // fall through
          case 77: break;
          case 29: 
            { return DASHES;
            } 
            // fall through
          case 78: break;
          case 30: 
            { _typeReq = false; return ARR;
            } 
            // fall through
          case 79: break;
          case 31: 
            { yybegin(xTAG); return TAG_NAME_SEE;
            } 
            // fall through
          case 80: break;
          case 32: 
            { return FUN;
            } 
            // fall through
          case 81: break;
          case 33: 
            { beginType(); return TAG_NAME_TYPE;
            } 
            // fall through
          case 82: break;
          case 34: 
            { yybegin(xFIELD); return TAG_NAME_FIELD;
            } 
            // fall through
          case 83: break;
          case 35: 
            { yybegin(xPARAM); return TAG_NAME_PARAM;
            } 
            // fall through
          case 84: break;
          case 36: 
            { yybegin(xCLASS); return TAG_NAME_CLASS;
            } 
            // fall through
          case 85: break;
          case 37: 
            { return TAG_NAME_PUBLIC;
            } 
            // fall through
          case 86: break;
          case 38: 
            { beginType(); return TAG_NAME_RETURN;
            } 
            // fall through
          case 87: break;
          case 39: 
            { yybegin(xCLASS); return TAG_NAME_MODULE;
            } 
            // fall through
          case 88: break;
          case 40: 
            { yybegin(xPARAM); return TAG_NAME_VARARG;
            } 
            // fall through
          case 89: break;
          case 41: 
            { _typeReq = true; return TAG_NAME_VARARG;
            } 
            // fall through
          case 90: break;
          case 42: 
            { yybegin(xFIELD_ID); return PUBLIC;
            } 
            // fall through
          case 91: break;
          case 43: 
            { return TAG_NAME_PRIVATE;
            } 
            // fall through
          case 92: break;
          case 44: 
            { yybegin(xGENERIC); return TAG_NAME_GENERIC;
            } 
            // fall through
          case 93: break;
          case 45: 
            { yybegin(xFIELD_ID); return PRIVATE;
            } 
            // fall through
          case 94: break;
          case 46: 
            { yybegin(xTAG_WITH_ID); return TAG_NAME_LANGUAGE;
            } 
            // fall through
          case 95: break;
          case 47: 
            { beginType(); return TAG_NAME_OVERLOAD;
            } 
            // fall through
          case 96: break;
          case 48: 
            { return TAG_NAME_PROTECTED;
            } 
            // fall through
          case 97: break;
          case 49: 
            { yybegin(xFIELD_ID); return PROTECTED;
            } 
            // fall through
          case 98: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
