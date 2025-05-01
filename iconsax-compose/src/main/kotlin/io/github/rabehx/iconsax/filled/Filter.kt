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


val Iconsax.Filled.Filter: ImageVector
    get() {
        if (_Filter != null) {
            return _Filter!!
        }
        _Filter = ImageVector.Builder(
            name = "Filled.Filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.601f, 4.102f)
                verticalLineTo(6.302f)
                curveTo(20.601f, 7.102f, 20.101f, 8.102f, 19.601f, 8.602f)
                lineTo(15.301f, 12.402f)
                curveTo(14.701f, 12.902f, 14.301f, 13.902f, 14.301f, 14.702f)
                verticalLineTo(19.002f)
                curveTo(14.301f, 19.602f, 13.901f, 20.402f, 13.401f, 20.702f)
                lineTo(12.001f, 21.602f)
                curveTo(10.701f, 22.402f, 8.901f, 21.502f, 8.901f, 19.902f)
                verticalLineTo(14.602f)
                curveTo(8.901f, 13.902f, 8.501f, 13.002f, 8.101f, 12.502f)
                lineTo(7.631f, 12.012f)
                curveTo(7.321f, 11.682f, 7.261f, 11.182f, 7.511f, 10.792f)
                lineTo(12.631f, 2.572f)
                curveTo(12.811f, 2.282f, 13.131f, 2.102f, 13.481f, 2.102f)
                horizontalLineTo(18.601f)
                curveTo(19.701f, 2.102f, 20.601f, 3.002f, 20.601f, 4.102f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.35f, 3.632f)
                lineTo(6.8f, 9.322f)
                curveTo(6.46f, 9.872f, 5.68f, 9.952f, 5.23f, 9.482f)
                lineTo(4.3f, 8.502f)
                curveTo(3.8f, 8.002f, 3.4f, 7.102f, 3.4f, 6.502f)
                verticalLineTo(4.202f)
                curveTo(3.4f, 3.002f, 4.3f, 2.102f, 5.4f, 2.102f)
                horizontalLineTo(9.5f)
                curveTo(10.28f, 2.102f, 10.76f, 2.962f, 10.35f, 3.632f)
                close()
            }
        }.build()

        return _Filter!!
    }

@Suppress("ObjectPropertyName")
private var _Filter: ImageVector? = null
