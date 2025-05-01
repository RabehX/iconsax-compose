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

val Iconsax.Filled.Bag2: ImageVector
    get() {
        if (_Bag2 != null) {
            return _Bag2!!
        }
        _Bag2 = ImageVector.Builder(
            name = "Filled.Bag2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.96f, 8.958f)
                curveTo(19.29f, 8.218f, 18.28f, 7.788f, 16.88f, 7.638f)
                verticalLineTo(6.878f)
                curveTo(16.88f, 5.508f, 16.3f, 4.188f, 15.28f, 3.268f)
                curveTo(14.25f, 2.328f, 12.91f, 1.888f, 11.52f, 2.018f)
                curveTo(9.13f, 2.248f, 7.12f, 4.558f, 7.12f, 7.058f)
                verticalLineTo(7.638f)
                curveTo(5.72f, 7.788f, 4.71f, 8.218f, 4.04f, 8.958f)
                curveTo(3.07f, 10.038f, 3.1f, 11.478f, 3.21f, 12.478f)
                lineTo(3.91f, 18.048f)
                curveTo(4.12f, 19.998f, 4.91f, 21.998f, 9.21f, 21.998f)
                horizontalLineTo(14.79f)
                curveTo(19.09f, 21.998f, 19.88f, 19.998f, 20.09f, 18.058f)
                lineTo(20.79f, 12.468f)
                curveTo(20.9f, 11.478f, 20.92f, 10.038f, 19.96f, 8.958f)
                close()
                moveTo(11.66f, 3.408f)
                curveTo(12.66f, 3.318f, 13.61f, 3.628f, 14.35f, 4.298f)
                curveTo(15.08f, 4.958f, 15.49f, 5.898f, 15.49f, 6.878f)
                verticalLineTo(7.578f)
                horizontalLineTo(8.51f)
                verticalLineTo(7.058f)
                curveTo(8.51f, 5.278f, 9.98f, 3.568f, 11.66f, 3.408f)
                close()
                moveTo(8.42f, 13.148f)
                horizontalLineTo(8.41f)
                curveTo(7.86f, 13.148f, 7.41f, 12.698f, 7.41f, 12.148f)
                curveTo(7.41f, 11.598f, 7.86f, 11.148f, 8.41f, 11.148f)
                curveTo(8.97f, 11.148f, 9.42f, 11.598f, 9.42f, 12.148f)
                curveTo(9.42f, 12.698f, 8.97f, 13.148f, 8.42f, 13.148f)
                close()
                moveTo(15.42f, 13.148f)
                horizontalLineTo(15.41f)
                curveTo(14.86f, 13.148f, 14.41f, 12.698f, 14.41f, 12.148f)
                curveTo(14.41f, 11.598f, 14.86f, 11.148f, 15.41f, 11.148f)
                curveTo(15.97f, 11.148f, 16.42f, 11.598f, 16.42f, 12.148f)
                curveTo(16.42f, 12.698f, 15.97f, 13.148f, 15.42f, 13.148f)
                close()
            }
        }.build()

        return _Bag2!!
    }

@Suppress("ObjectPropertyName")
private var _Bag2: ImageVector? = null
