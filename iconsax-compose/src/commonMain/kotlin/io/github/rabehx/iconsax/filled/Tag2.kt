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


val Iconsax.Filled.Tag2: ImageVector
    get() {
        if (_Tag2 != null) {
            return _Tag2!!
        }
        _Tag2 = ImageVector.Builder(
            name = "Filled.Tag2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.83f, 8.7f)
                lineTo(15.3f, 4.17f)
                curveTo(14.351f, 3.22f, 13.04f, 2.71f, 11.7f, 2.78f)
                lineTo(6.7f, 3.02f)
                curveTo(4.7f, 3.11f, 3.11f, 4.7f, 3.01f, 6.69f)
                lineTo(2.77f, 11.69f)
                curveTo(2.71f, 13.03f, 3.21f, 14.34f, 4.16f, 15.29f)
                lineTo(8.69f, 19.82f)
                curveTo(10.55f, 21.68f, 13.571f, 21.68f, 15.441f, 19.82f)
                lineTo(19.83f, 15.43f)
                curveTo(21.701f, 13.58f, 21.701f, 10.56f, 19.83f, 8.7f)
                close()
                moveTo(9.5f, 12.38f)
                curveTo(7.92f, 12.38f, 6.62f, 11.09f, 6.62f, 9.5f)
                curveTo(6.62f, 7.91f, 7.92f, 6.62f, 9.5f, 6.62f)
                curveTo(11.08f, 6.62f, 12.38f, 7.91f, 12.38f, 9.5f)
                curveTo(12.38f, 11.09f, 11.08f, 12.38f, 9.5f, 12.38f)
                close()
                moveTo(17.531f, 13.53f)
                lineTo(13.531f, 17.53f)
                curveTo(13.38f, 17.68f, 13.191f, 17.75f, 13f, 17.75f)
                curveTo(12.811f, 17.75f, 12.62f, 17.68f, 12.47f, 17.53f)
                curveTo(12.181f, 17.24f, 12.181f, 16.76f, 12.47f, 16.47f)
                lineTo(16.471f, 12.47f)
                curveTo(16.76f, 12.18f, 17.24f, 12.18f, 17.531f, 12.47f)
                curveTo(17.82f, 12.76f, 17.82f, 13.24f, 17.531f, 13.53f)
                close()
            }
        }.build()

        return _Tag2!!
    }

@Suppress("ObjectPropertyName")
private var _Tag2: ImageVector? = null
