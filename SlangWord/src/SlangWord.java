public class SlangWord implements Comparable<SlangWord> {
    private String slang;
    private String definition;

    public String getSlang() {
        return slang;
    }

    public void setSlang(String slang) {
        this.slang = slang;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public SlangWord(String slang, String meaning) {
        this.slang = slang;
        this.definition = meaning;
    }

    @Override
    public int compareTo(SlangWord slangWord) {
        return slang.compareTo(slangWord.slang);
    }
}
