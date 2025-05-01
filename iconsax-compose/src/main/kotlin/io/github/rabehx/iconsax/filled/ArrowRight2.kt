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

val Iconsax.Filled.ArrowRight2: ImageVector
    get() {
        if (_ArrowRight2 != null) {
            return _ArrowRight2!!
        }
        _ArrowRight2 = ImageVector.Builder(
            name = "Filled.ArrowRight2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.2f, 10.492f)
                lineTo(13.23f, 8.522f)
                lineTo(10.02f, 5.312f)
                curveTo(9.34f, 4.642f, 8.18f, 5.122f, 8.18f, 6.082f)
                verticalLineTo(12.312f)
                verticalLineTo(17.922f)
                curveTo(8.18f, 18.882f, 9.34f, 19.362f, 10.02f, 18.682f)
                lineTo(15.2f, 13.502f)
                curveTo(16.03f, 12.682f, 16.03f, 11.322f, 15.2f, 10.492f)
                close()
            }
        }.build()

        return _ArrowRight2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight2: ImageVector? = null
