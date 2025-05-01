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


val Iconsax.Filled.Sticker: ImageVector
    get() {
        if (_Sticker != null) {
            return _Sticker!!
        }
        _Sticker = ImageVector.Builder(
            name = "Filled.Sticker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.959f, 11.661f)
                curveTo(20.77f, 10.911f, 19.389f, 10.501f, 17.969f, 10.501f)
                curveTo(13.83f, 10.501f, 10.469f, 13.861f, 10.469f, 18.001f)
                curveTo(10.469f, 19.421f, 10.87f, 20.791f, 11.62f, 21.981f)
                curveTo(11.16f, 21.971f, 10.689f, 21.921f, 10.21f, 21.851f)
                curveTo(6.1f, 21.151f, 2.789f, 17.821f, 2.109f, 13.701f)
                curveTo(0.98f, 6.851f, 6.819f, 1.011f, 13.67f, 2.141f)
                curveTo(17.789f, 2.821f, 21.119f, 6.131f, 21.819f, 10.241f)
                curveTo(21.899f, 10.721f, 21.949f, 11.201f, 21.959f, 11.661f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.381f, 21.86f)
                curveTo(12.501f, 20.82f, 11.971f, 19.47f, 11.971f, 18f)
                curveTo(11.971f, 14.69f, 14.661f, 12f, 17.971f, 12f)
                curveTo(19.441f, 12f, 20.791f, 12.53f, 21.831f, 13.41f)
            }
        }.build()

        return _Sticker!!
    }

@Suppress("ObjectPropertyName")
private var _Sticker: ImageVector? = null
