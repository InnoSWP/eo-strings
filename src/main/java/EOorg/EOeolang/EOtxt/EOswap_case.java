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
// @checkstyle PackageNameCheck (1 line)
package EOorg.EOeolang.EOtxt;

import org.eolang.AtComposite;
import org.eolang.AtFree;
import org.eolang.Data;
import org.eolang.Param;
import org.eolang.PhDefault;
import org.eolang.Phi;

/**
 * Swap-case.
 *
 * @since 0.0.0
 * @checkstyle TypeNameCheck (100 lines)
 */
public class EOswap_case extends PhDefault {
    /**
     * Ctor.
     * @param sigma The \sigma
     * @checkstyle BracketsStructureCheck (200 lines)
     */
    public EOswap_case(final Phi sigma) {
        super(sigma);
        this.add("s", new AtFree());
        this.add("φ", new AtComposite(this, rho -> {
            final String str = new Param(rho, "s").strong(String.class);
            String res = "";
            for (int idx = 0; idx < str.length(); idx += 1) {
                final char chr = str.charAt(idx);
                if (Character.isUpperCase(chr)) {
                    res += Character.toLowerCase(chr);
                } else if (Character.isLowerCase(chr)) {
                    res += Character.toUpperCase(chr);
                } else {
                    res += chr;
                }
            }
            return new Data.ToPhi(res);
        }));
    }

}
