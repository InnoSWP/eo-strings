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

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eolang.AtComposite;
import org.eolang.AtFree;
import org.eolang.Data;
import org.eolang.Param;
import org.eolang.PhDefault;
import org.eolang.Phi;
import org.eolang.XmirObject;

/**
 * REGEX.MATCH.
 *
 * @checkstyle TypeNameCheck (15 lines)
 * @checkstyle JavadocMethodCheck (15 lines)
 * @checkstyle BracketsStructureCheck (15 lines)
 * @checkstyle ReturnCountCheck (15 lines)
 * @since 0.1
 */
@XmirObject(oname = "regex.match")
public class EOregex$EOmatch extends PhDefault {

    public EOregex$EOmatch(final Phi sigma) {
        super(sigma);
        this.add("txt", new AtFree());
        this.add("φ", new AtComposite(this, rho -> {
            final Phi regex = rho.attr("ρ").get();
            final String str = new Param(regex, "r").strong(String.class);
            final String txt = new Param(rho, "txt").strong(String.class);
            final Matcher matcher = Pattern.compile(str).matcher(txt);
            if (matcher.matches()) {
                int count = matcher.groupCount();
                if (count == 0) {
                    count = 1;
                }
                final Phi[] dest = new Phi[count];
                return new Data.ToPhi(dest);
            } else {
                return new Data.ToPhi(new Phi[]{});
            }
        }));
    }

}
