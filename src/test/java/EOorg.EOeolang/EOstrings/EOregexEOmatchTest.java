/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2022 timolai-andrievich
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
/**
 * EO-strings.
 *
 * @since 0.1
 *
 * @checkstyle PackageNameCheck (5 lines)
 * @checkstyle PackageDeclarationCheck (5 lines)
 * @checkstyle PackageCase (5 lines)
 */
package EOorg.EOeolang.EOstrings;

import EOorg.EOeolang.EOtxt.EOregex;
import EOorg.EOeolang.EOtxt.EOregex$EOcompile;
import EOorg.EOeolang.EOtxt.EOregex$EOmatch;
import org.eolang.Data;
import org.eolang.Dataized;
import org.eolang.PhMethod;
import org.eolang.PhWith;
import org.eolang.Phi;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * Test case for {@link EOregex$EOmatch}.
 *
 * @since 0.1
 * @checkstyle TypeNameCheck (15 lines)
 * @checkstyle JavadocMethodCheck (15 lines)
 * @checkstyle BracketsStructureCheck (15 lines)
 * @checkstyle ReturnCountCheck (15 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (15 lines)
 */
public final class EOregexEOmatchTest {

    /**
     * Method name.
     */
    private static final String MATCH = "match";

    /**
     * Attribute name.
     */
    private static final String TXT = "txt";

    @Test
    public void matchesString() {
        final String str = "/([a-z]+)/";
        final Phi regex = new EOorg.EOeolang.EOtxt.EOregex(Phi.Φ);
        regex.attr("r").put(new Data.ToPhi(str));
        final Phi compiled = new EOorg.EOeolang.EOtxt.EOregex$EOcompile(regex);
        MatcherAssert.assertThat(
            new Dataized(
                new PhWith(
                    new PhMethod(compiled, MATCH),
                    TXT,
                    new Data.ToPhi("hello")
                )
            ).take(Phi[].class).length,
            Matchers.equalTo(1)
        );
    }

    @Test
    public void matchesStringWithEntirePattern() {
        final String str = "/([a-z]+)/";
        final Phi regex = new EOorg.EOeolang.EOtxt.EOregex(Phi.Φ);
        regex.attr(0).put(new Data.ToPhi(str));
        final Phi compiled = new EOorg.EOeolang.EOtxt.EOregex$EOcompile(regex);
        MatcherAssert.assertThat(
            new Dataized(
                new PhWith(
                    new PhMethod(compiled, MATCH),
                    TXT,
                    new Data.ToPhi("welcome")
                )
            ).take(Phi[].class).length,
            Matchers.equalTo(1)
        );
    }

    @Test
    public void doesntMatchString() {
        final String str = "/([A-Z]{2})/";
        final Phi regex = new EOregex(Phi.Φ);
        regex.attr(0).put(new Data.ToPhi(str));
        final Phi compiled = new EOregex$EOcompile(regex);
        MatcherAssert.assertThat(
            new Dataized(
                new PhWith(
                    new PhMethod(compiled, MATCH),
                    TXT,
                    new Data.ToPhi("Hello, World!")
                )
            ).take(Phi[].class).length,
            Matchers.equalTo(0)
        );
    }

}
