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


val Iconsax.Filled.CloudAdd: ImageVector
    get() {
        if (_CloudAdd != null) {
            return _CloudAdd!!
        }
        _CloudAdd = ImageVector.Builder(
            name = "Filled.CloudAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 11.531f)
                curveTo(9.24f, 11.531f, 7f, 13.771f, 7f, 16.531f)
                curveTo(7f, 17.271f, 7.16f, 17.971f, 7.46f, 18.591f)
                curveTo(7.54f, 18.771f, 7.63f, 18.941f, 7.73f, 19.101f)
                curveTo(8.59f, 20.551f, 10.18f, 21.531f, 12f, 21.531f)
                curveTo(13.82f, 21.531f, 15.41f, 20.551f, 16.27f, 19.101f)
                curveTo(16.37f, 18.941f, 16.46f, 18.771f, 16.54f, 18.591f)
                curveTo(16.84f, 17.971f, 17f, 17.271f, 17f, 16.531f)
                curveTo(17f, 13.771f, 14.76f, 11.531f, 12f, 11.531f)
                close()
                moveTo(14.07f, 16.101f)
                lineTo(11.94f, 18.071f)
                curveTo(11.8f, 18.201f, 11.61f, 18.271f, 11.43f, 18.271f)
                curveTo(11.24f, 18.271f, 11.05f, 18.201f, 10.9f, 18.051f)
                lineTo(9.91f, 17.061f)
                curveTo(9.62f, 16.771f, 9.62f, 16.291f, 9.91f, 16.001f)
                curveTo(10.2f, 15.711f, 10.68f, 15.711f, 10.97f, 16.001f)
                lineTo(11.45f, 16.481f)
                lineTo(13.05f, 15.001f)
                curveTo(13.36f, 14.721f, 13.83f, 14.741f, 14.11f, 15.041f)
                curveTo(14.39f, 15.341f, 14.37f, 15.811f, 14.07f, 16.101f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.199f, 17.072f)
                curveTo(19.839f, 17.392f, 19.449f, 17.662f, 19.029f, 17.882f)
                curveTo(18.669f, 18.062f, 18.309f, 17.712f, 18.369f, 17.312f)
                curveTo(18.409f, 17.021f, 18.429f, 16.722f, 18.429f, 16.412f)
                curveTo(18.429f, 12.832f, 15.509f, 9.911f, 11.929f, 9.911f)
                curveTo(8.349f, 9.911f, 5.429f, 12.832f, 5.429f, 16.412f)
                curveTo(5.429f, 16.872f, 5.479f, 17.312f, 5.569f, 17.742f)
                curveTo(5.639f, 18.091f, 5.369f, 18.441f, 5.019f, 18.351f)
                curveTo(1.069f, 17.392f, 1.049f, 11.311f, 5.469f, 11.002f)
                horizontalLineTo(5.519f)
                curveTo(2.309f, 2.071f, 15.849f, -1.499f, 17.399f, 7.881f)
                curveTo(21.729f, 8.431f, 23.479f, 14.201f, 20.199f, 17.072f)
                close()
            }
        }.build()

        return _CloudAdd!!
    }

@Suppress("ObjectPropertyName")
private var _CloudAdd: ImageVector? = null
