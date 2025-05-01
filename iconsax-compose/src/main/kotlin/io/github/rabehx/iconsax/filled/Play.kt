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


val Iconsax.Filled.Play: ImageVector
    get() {
        if (_Play != null) {
            return _Play!!
        }
        _Play = ImageVector.Builder(
            name = "Filled.Play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.49f, 9.6f)
                lineTo(5.6f, 16.77f)
                curveTo(4.9f, 17.19f, 4f, 16.69f, 4f, 15.87f)
                verticalLineTo(7.87f)
                curveTo(4f, 4.38f, 7.77f, 2.2f, 10.8f, 3.94f)
                lineTo(15.39f, 6.58f)
                lineTo(17.48f, 7.78f)
                curveTo(18.17f, 8.19f, 18.18f, 9.19f, 17.49f, 9.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.089f, 15.461f)
                lineTo(14.039f, 17.801f)
                lineTo(9.999f, 20.131f)
                curveTo(8.549f, 20.961f, 6.909f, 20.791f, 5.719f, 19.951f)
                curveTo(5.139f, 19.551f, 5.209f, 18.661f, 5.819f, 18.301f)
                lineTo(18.529f, 10.681f)
                curveTo(19.129f, 10.321f, 19.919f, 10.661f, 20.029f, 11.351f)
                curveTo(20.279f, 12.901f, 19.639f, 14.571f, 18.089f, 15.461f)
                close()
            }
        }.build()

        return _Play!!
    }

@Suppress("ObjectPropertyName")
private var _Play: ImageVector? = null
