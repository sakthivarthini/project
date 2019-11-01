/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 * http://www.gnu.org/copyleft/gpl.html
 */

package razesoldier.epub.hant2hans;

import com.mayabot.nlp.logging.InternalLoggerFactory;
import com.mayabot.nlp.logging.JdkLoggerFactory;
import com.mayabot.nlp.transform.Traditional2Simplified;
import com.mayabot.nlp.transform.TransformService;
import org.jetbrains.annotations.NotNull;

/**
 * This implementation use com.mayabot.mynlp:mynlp-transform library.
 */
class MynlpConverter implements VariantConverter {
    private Traditional2Simplified converter;

    MynlpConverter() {
        InternalLoggerFactory.setDefaultFactory(JdkLoggerFactory.INSTANCE); // Using JdkLogger
        converter = TransformService.traditional2Simplified();
    }

    public String convert(@NotNull String source) {
        return converter.transform(source);
    }
}
