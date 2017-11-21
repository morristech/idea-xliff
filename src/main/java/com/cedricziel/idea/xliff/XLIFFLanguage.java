package com.cedricziel.idea.xliff;

import com.intellij.lang.xml.XMLLanguage;

public class XLIFFLanguage extends XMLLanguage {

    public static final XLIFFLanguage INSTANCE = new XLIFFLanguage();

    protected XLIFFLanguage() {
        super(XMLLanguage.INSTANCE, "XLIFF 1.2", "application/xliff+xml", "application/x-xliff+xml");
    }
}
