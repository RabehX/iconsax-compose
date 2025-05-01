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

val Iconsax.Filled.BagTick2: ImageVector
    get() {
        if (_BagTick2 != null) {
            return _BagTick2!!
        }
        _BagTick2 = ImageVector.Builder(
            name = "Filled.BagTick2",
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
                curveTo(20.9f, 11.478f, 20.93f, 10.038f, 19.96f, 8.958f)
                close()
                moveTo(11.66f, 3.408f)
                curveTo(12.66f, 3.318f, 13.61f, 3.628f, 14.35f, 4.298f)
                curveTo(15.08f, 4.958f, 15.49f, 5.898f, 15.49f, 6.878f)
                verticalLineTo(7.578f)
                horizontalLineTo(8.51f)
                verticalLineTo(7.058f)
                curveTo(8.51f, 5.278f, 9.98f, 3.568f, 11.66f, 3.408f)
                close()
                moveTo(12f, 18.578f)
                curveTo(9.91f, 18.578f, 8.21f, 16.878f, 8.21f, 14.788f)
                curveTo(8.21f, 12.698f, 9.91f, 10.998f, 12f, 10.998f)
                curveTo(14.09f, 10.998f, 15.79f, 12.698f, 15.79f, 14.788f)
                curveTo(15.79f, 16.878f, 14.09f, 18.578f, 12f, 18.578f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.431f, 16.64f)
                curveTo(11.241f, 16.64f, 11.051f, 16.57f, 10.901f, 16.42f)
                lineTo(9.911f, 15.43f)
                curveTo(9.621f, 15.14f, 9.621f, 14.66f, 9.911f, 14.37f)
                curveTo(10.201f, 14.08f, 10.681f, 14.08f, 10.971f, 14.37f)
                lineTo(11.451f, 14.85f)
                lineTo(13.051f, 13.37f)
                curveTo(13.351f, 13.09f, 13.831f, 13.11f, 14.111f, 13.41f)
                curveTo(14.391f, 13.71f, 14.371f, 14.19f, 14.071f, 14.47f)
                lineTo(11.941f, 16.44f)
                curveTo(11.791f, 16.57f, 11.611f, 16.64f, 11.431f, 16.64f)
                close()
            }
        }.build()

        return _BagTick2!!
    }

@Suppress("ObjectPropertyName")
private var _BagTick2: ImageVector? = null
