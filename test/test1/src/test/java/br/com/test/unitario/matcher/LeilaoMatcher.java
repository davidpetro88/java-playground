package br.com.test.unitario.matcher;

import br.com.test.unitario.Lance;
import br.com.test.unitario.Leilao;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/**
 * Created by david on 30/12/16.
 */
public class LeilaoMatcher extends TypeSafeMatcher<Leilao> {
    private final Lance lance;

    public LeilaoMatcher(Lance lance) {
        this.lance = lance;
    }

    public void describeTo(Description description) {
        description.appendText("leilao com lance " + lance.getValor());
    }

    @Override
    protected boolean matchesSafely(Leilao item) {
        return item.getLances().contains(lance);
    }

    public static Matcher<Leilao> temUmLance(Lance lance) {
        return new LeilaoMatcher(lance);
    }
}
