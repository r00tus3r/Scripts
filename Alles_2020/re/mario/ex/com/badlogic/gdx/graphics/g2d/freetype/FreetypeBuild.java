package com.badlogic.gdx.graphics.g2d.freetype;

import com.badlogic.gdx.jnigen.AntScriptGenerator;
import com.badlogic.gdx.jnigen.BuildConfig;
import com.badlogic.gdx.jnigen.BuildTarget;
import com.badlogic.gdx.jnigen.NativeCodeGenerator;

public class FreetypeBuild {
  public static void main(String[] paramArrayOfString) throws Exception {
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = "freetype-2.5.5/include";
    String[] arrayOfString2 = new String[44];
    arrayOfString2[0] = "freetype-2.5.5/src/base/ftsystem.c";
    arrayOfString2[1] = "freetype-2.5.5/src/base/ftinit.c";
    arrayOfString2[2] = "freetype-2.5.5/src/base/ftdebug.c";
    arrayOfString2[3] = "freetype-2.5.5/src/base/ftbase.c";
    arrayOfString2[4] = "freetype-2.5.5/src/base/ftbbox.c";
    arrayOfString2[5] = "freetype-2.5.5/src/base/ftglyph.c";
    arrayOfString2[6] = "freetype-2.5.5/src/base/ftbdf.c";
    arrayOfString2[7] = "freetype-2.5.5/src/base/ftbitmap.c";
    arrayOfString2[8] = "freetype-2.5.5/src/base/ftcid.c";
    arrayOfString2[9] = "freetype-2.5.5/src/base/ftfstype.c";
    arrayOfString2[10] = "freetype-2.5.5/src/base/ftgasp.c";
    arrayOfString2[11] = "freetype-2.5.5/src/base/ftgxval.c";
    arrayOfString2[12] = "freetype-2.5.5/src/base/ftlcdfil.c";
    arrayOfString2[13] = "freetype-2.5.5/src/base/ftmm.c";
    arrayOfString2[14] = "freetype-2.5.5/src/base/ftotval.c";
    arrayOfString2[15] = "freetype-2.5.5/src/base/ftpatent.c";
    arrayOfString2[16] = "freetype-2.5.5/src/base/ftpfr.c";
    arrayOfString2[17] = "freetype-2.5.5/src/base/ftstroke.c";
    arrayOfString2[18] = "freetype-2.5.5/src/base/ftsynth.c";
    arrayOfString2[19] = "freetype-2.5.5/src/base/fttype1.c";
    arrayOfString2[20] = "freetype-2.5.5/src/base/ftwinfnt.c";
    arrayOfString2[21] = "freetype-2.5.5/src/base/ftxf86.c";
    arrayOfString2[22] = "freetype-2.5.5/src/bdf/bdf.c";
    arrayOfString2[23] = "freetype-2.5.5/src/cff/cff.c";
    arrayOfString2[24] = "freetype-2.5.5/src/cid/type1cid.c";
    arrayOfString2[25] = "freetype-2.5.5/src/pcf/pcf.c";
    arrayOfString2[26] = "freetype-2.5.5/src/pfr/pfr.c";
    arrayOfString2[27] = "freetype-2.5.5/src/sfnt/sfnt.c";
    arrayOfString2[28] = "freetype-2.5.5/src/truetype/truetype.c";
    arrayOfString2[29] = "freetype-2.5.5/src/type1/type1.c";
    arrayOfString2[30] = "freetype-2.5.5/src/type42/type42.c";
    arrayOfString2[31] = "freetype-2.5.5/src/winfonts/winfnt.c";
    arrayOfString2[32] = "freetype-2.5.5/src/raster/raster.c";
    arrayOfString2[33] = "freetype-2.5.5/src/smooth/smooth.c";
    arrayOfString2[34] = "freetype-2.5.5/src/autofit/autofit.c";
    arrayOfString2[35] = "freetype-2.5.5/src/cache/ftcache.c";
    arrayOfString2[36] = "freetype-2.5.5/src/gzip/ftgzip.c";
    arrayOfString2[37] = "freetype-2.5.5/src/lzw/ftlzw.c";
    arrayOfString2[38] = "freetype-2.5.5/src/bzip2/ftbzip2.c";
    arrayOfString2[39] = "freetype-2.5.5/src/gxvalid/gxvalid.c";
    arrayOfString2[40] = "freetype-2.5.5/src/otvalid/otvalid.c";
    arrayOfString2[41] = "freetype-2.5.5/src/psaux/psaux.c";
    arrayOfString2[42] = "freetype-2.5.5/src/pshinter/pshinter.c";
    arrayOfString2[43] = "freetype-2.5.5/src/psnames/psnames.c";
    BuildTarget buildTarget1 = BuildTarget.newDefaultTarget(BuildTarget.TargetOs.Windows, false);
    buildTarget1.compilerPrefix = "";
    buildTarget1.buildFileName = "build-windows32home.xml";
    buildTarget1.excludeFromMasterBuildFile = true;
    buildTarget1.headerDirs = arrayOfString1;
    buildTarget1.cIncludes = arrayOfString2;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(buildTarget1.cFlags);
    stringBuilder2.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget1.cFlags = stringBuilder2.toString();
    stringBuilder2 = new StringBuilder();
    stringBuilder2.append(buildTarget1.cppFlags);
    stringBuilder2.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget1.cppFlags = stringBuilder2.toString();
    BuildTarget buildTarget2 = BuildTarget.newDefaultTarget(BuildTarget.TargetOs.Windows, false);
    buildTarget2.headerDirs = arrayOfString1;
    buildTarget2.cIncludes = arrayOfString2;
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append(buildTarget2.cFlags);
    stringBuilder3.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget2.cFlags = stringBuilder3.toString();
    stringBuilder3 = new StringBuilder();
    stringBuilder3.append(buildTarget2.cppFlags);
    stringBuilder3.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget2.cppFlags = stringBuilder3.toString();
    BuildTarget buildTarget3 = BuildTarget.newDefaultTarget(BuildTarget.TargetOs.Windows, true);
    buildTarget3.headerDirs = arrayOfString1;
    buildTarget3.cIncludes = arrayOfString2;
    StringBuilder stringBuilder4 = new StringBuilder();
    stringBuilder4.append(buildTarget3.cFlags);
    stringBuilder4.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget3.cFlags = stringBuilder4.toString();
    stringBuilder4 = new StringBuilder();
    stringBuilder4.append(buildTarget3.cppFlags);
    stringBuilder4.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget3.cppFlags = stringBuilder4.toString();
    BuildTarget buildTarget4 = BuildTarget.newDefaultTarget(BuildTarget.TargetOs.Linux, false);
    buildTarget4.headerDirs = arrayOfString1;
    buildTarget4.cIncludes = arrayOfString2;
    StringBuilder stringBuilder5 = new StringBuilder();
    stringBuilder5.append(buildTarget4.cFlags);
    stringBuilder5.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget4.cFlags = stringBuilder5.toString();
    stringBuilder5 = new StringBuilder();
    stringBuilder5.append(buildTarget4.cppFlags);
    stringBuilder5.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget4.cppFlags = stringBuilder5.toString();
    BuildTarget buildTarget5 = BuildTarget.newDefaultTarget(BuildTarget.TargetOs.Linux, true);
    buildTarget5.headerDirs = arrayOfString1;
    buildTarget5.cIncludes = arrayOfString2;
    StringBuilder stringBuilder6 = new StringBuilder();
    stringBuilder6.append(buildTarget5.cFlags);
    stringBuilder6.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget5.cFlags = stringBuilder6.toString();
    stringBuilder6 = new StringBuilder();
    stringBuilder6.append(buildTarget5.cppFlags);
    stringBuilder6.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget5.cppFlags = stringBuilder6.toString();
    BuildTarget buildTarget6 = BuildTarget.newDefaultTarget(BuildTarget.TargetOs.MacOsX, false);
    buildTarget6.headerDirs = arrayOfString1;
    buildTarget6.cIncludes = arrayOfString2;
    StringBuilder stringBuilder7 = new StringBuilder();
    stringBuilder7.append(buildTarget6.cFlags);
    stringBuilder7.append(" -DFT2_BUILD_LIBRARY");
    buildTarget6.cFlags = stringBuilder7.toString();
    stringBuilder7 = new StringBuilder();
    stringBuilder7.append(buildTarget6.cppFlags);
    stringBuilder7.append(" -DFT2_BUILD_LIBRARY");
    buildTarget6.cppFlags = stringBuilder7.toString();
    stringBuilder7 = new StringBuilder();
    stringBuilder7.append(buildTarget6.linkerFlags);
    stringBuilder7.append(" -framework CoreServices -framework Carbon");
    buildTarget6.linkerFlags = stringBuilder7.toString();
    BuildTarget buildTarget7 = BuildTarget.newDefaultTarget(BuildTarget.TargetOs.MacOsX, true);
    buildTarget7.headerDirs = arrayOfString1;
    buildTarget7.cIncludes = arrayOfString2;
    StringBuilder stringBuilder8 = new StringBuilder();
    stringBuilder8.append(buildTarget7.cFlags);
    stringBuilder8.append(" -DFT2_BUILD_LIBRARY");
    buildTarget7.cFlags = stringBuilder8.toString();
    stringBuilder8 = new StringBuilder();
    stringBuilder8.append(buildTarget7.cppFlags);
    stringBuilder8.append(" -DFT2_BUILD_LIBRARY");
    buildTarget7.cppFlags = stringBuilder8.toString();
    stringBuilder8 = new StringBuilder();
    stringBuilder8.append(buildTarget7.linkerFlags);
    stringBuilder8.append(" -framework CoreServices -framework Carbon");
    buildTarget7.linkerFlags = stringBuilder8.toString();
    BuildTarget buildTarget8 = BuildTarget.newDefaultTarget(BuildTarget.TargetOs.Android, false);
    buildTarget8.headerDirs = arrayOfString1;
    buildTarget8.cIncludes = arrayOfString2;
    StringBuilder stringBuilder9 = new StringBuilder();
    stringBuilder9.append(buildTarget8.cFlags);
    stringBuilder9.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget8.cFlags = stringBuilder9.toString();
    stringBuilder9 = new StringBuilder();
    stringBuilder9.append(buildTarget8.cppFlags);
    stringBuilder9.append(" -std=c99 -DFT2_BUILD_LIBRARY");
    buildTarget8.cppFlags = stringBuilder9.toString();
    BuildTarget buildTarget9 = BuildTarget.newDefaultTarget(BuildTarget.TargetOs.IOS, false);
    buildTarget9.headerDirs = arrayOfString1;
    buildTarget9.cIncludes = arrayOfString2;
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(buildTarget9.cFlags);
    stringBuilder1.append(" -DFT2_BUILD_LIBRARY");
    buildTarget9.cFlags = stringBuilder1.toString();
    stringBuilder1 = new StringBuilder();
    stringBuilder1.append(buildTarget9.cppFlags);
    stringBuilder1.append(" -DFT2_BUILD_LIBRARY");
    buildTarget9.cppFlags = stringBuilder1.toString();
    (new NativeCodeGenerator()).generate();
    (new AntScriptGenerator()).generate(new BuildConfig("gdx-freetype"), new BuildTarget[] { buildTarget1, buildTarget2, buildTarget3, buildTarget4, buildTarget5, buildTarget6, buildTarget7, buildTarget8, buildTarget9 });
  }
}


/* Location:              /home/r00tus3r/ctfs/2020/alles/re/prehistoric-mario-dex2jar.jar!/com/badlogic/gdx/graphics/g2d/freetype/FreetypeBuild.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.6
 */