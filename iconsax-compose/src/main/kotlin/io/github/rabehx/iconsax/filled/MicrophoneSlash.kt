/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.MicrophoneSlash: ImageVector
    get() {
        if (_MicrophoneSlash != null) {
            return _MicrophoneSlash!!
        }
        _MicrophoneSlash = ImageVector.Builder(
            name = "Filled.MicrophoneSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.418f, 6.422f)
                verticalLineTo(7.582f)
                lineTo(9.138f, 14.862f)
                curveTo(8.178f, 13.992f, 7.578f, 12.712f, 7.578f, 11.342f)
                verticalLineTo(6.422f)
                curveTo(7.578f, 4.362f, 8.978f, 2.652f, 10.878f, 2.162f)
                curveTo(11.068f, 2.112f, 11.248f, 2.272f, 11.248f, 2.462f)
                verticalLineTo(4.002f)
                curveTo(11.248f, 4.412f, 11.588f, 4.752f, 11.998f, 4.752f)
                curveTo(12.408f, 4.752f, 12.748f, 4.412f, 12.748f, 4.002f)
                verticalLineTo(2.462f)
                curveTo(12.748f, 2.272f, 12.928f, 2.112f, 13.118f, 2.162f)
                curveTo(15.018f, 2.652f, 16.418f, 4.362f, 16.418f, 6.422f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.812f, 9.811f)
                verticalLineTo(11.401f)
                curveTo(19.812f, 15.471f, 16.682f, 18.821f, 12.702f, 19.171f)
                verticalLineTo(21.301f)
                curveTo(12.702f, 21.691f, 12.392f, 22.001f, 12.002f, 22.001f)
                curveTo(11.612f, 22.001f, 11.302f, 21.691f, 11.302f, 21.301f)
                verticalLineTo(19.171f)
                curveTo(10.212f, 19.071f, 9.182f, 18.751f, 8.262f, 18.241f)
                lineTo(9.292f, 17.211f)
                curveTo(10.112f, 17.591f, 11.032f, 17.811f, 12.002f, 17.811f)
                curveTo(15.542f, 17.811f, 18.422f, 14.931f, 18.422f, 11.401f)
                verticalLineTo(9.811f)
                curveTo(18.422f, 9.431f, 18.732f, 9.121f, 19.122f, 9.121f)
                curveTo(19.502f, 9.121f, 19.812f, 9.431f, 19.812f, 9.811f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.418f, 10.078f)
                verticalLineTo(11.528f)
                curveTo(16.418f, 14.108f, 14.198f, 16.178f, 11.558f, 15.928f)
                curveTo(11.278f, 15.898f, 10.998f, 15.848f, 10.738f, 15.758f)
                lineTo(16.418f, 10.078f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.771f, 2.229f)
                curveTo(21.471f, 1.929f, 20.981f, 1.929f, 20.681f, 2.229f)
                lineTo(7.231f, 15.679f)
                curveTo(6.201f, 14.549f, 5.581f, 13.049f, 5.581f, 11.399f)
                verticalLineTo(9.809f)
                curveTo(5.581f, 9.429f, 5.271f, 9.119f, 4.881f, 9.119f)
                curveTo(4.501f, 9.119f, 4.191f, 9.429f, 4.191f, 9.809f)
                verticalLineTo(11.399f)
                curveTo(4.191f, 13.429f, 4.971f, 15.279f, 6.241f, 16.669f)
                lineTo(2.221f, 20.689f)
                curveTo(1.921f, 20.989f, 1.921f, 21.479f, 2.221f, 21.779f)
                curveTo(2.381f, 21.919f, 2.571f, 21.999f, 2.771f, 21.999f)
                curveTo(2.971f, 21.999f, 3.161f, 21.919f, 3.311f, 21.769f)
                lineTo(21.771f, 3.309f)
                curveTo(22.081f, 3.009f, 22.081f, 2.529f, 21.771f, 2.229f)
                close()
            }
        }.build()

        return _MicrophoneSlash!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneSlash: ImageVector? = null
