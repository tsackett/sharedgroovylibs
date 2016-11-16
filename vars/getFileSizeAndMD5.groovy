import java.io.FileInputStream;

def call(filePath) {
    File ipa = new File(filePath);
    String size = String.valueOf(ipa.length());
    FileInputStream fis = new FileInputStream(ipa);
    String md5 = org.apache.commons.codec.digest.DigestUtils.md5Hex(fis);
    fis.close();
    return [size, md5];
}

