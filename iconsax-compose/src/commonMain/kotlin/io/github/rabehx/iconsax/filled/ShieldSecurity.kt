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


val Iconsax.Filled.ShieldSecurity: ImageVector
    get() {
        if (_ShieldSecurity != null) {
            return _ShieldSecurity!!
        }
        _ShieldSecurity = ImageVector.Builder(
            name = "Filled.ShieldSecurity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.541f, 4.171f)
                lineTo(13.041f, 2.111f)
                curveTo(12.471f, 1.901f, 11.541f, 1.901f, 10.971f, 2.111f)
                lineTo(5.471f, 4.171f)
                curveTo(4.411f, 4.571f, 3.551f, 5.811f, 3.551f, 6.941f)
                verticalLineTo(15.041f)
                curveTo(3.551f, 15.851f, 4.081f, 16.921f, 4.731f, 17.401f)
                lineTo(10.231f, 21.511f)
                curveTo(11.201f, 22.241f, 12.791f, 22.241f, 13.761f, 21.511f)
                lineTo(19.261f, 17.401f)
                curveTo(19.911f, 16.911f, 20.441f, 15.851f, 20.441f, 15.041f)
                verticalLineTo(6.941f)
                curveTo(20.451f, 5.811f, 19.591f, 4.571f, 18.541f, 4.171f)
                close()
                moveTo(12.751f, 12.871f)
                verticalLineTo(15.501f)
                curveTo(12.751f, 15.911f, 12.411f, 16.251f, 12.001f, 16.251f)
                curveTo(11.591f, 16.251f, 11.251f, 15.911f, 11.251f, 15.501f)
                verticalLineTo(12.871f)
                curveTo(10.241f, 12.551f, 9.501f, 11.611f, 9.501f, 10.501f)
                curveTo(9.501f, 9.121f, 10.621f, 8.001f, 12.001f, 8.001f)
                curveTo(13.381f, 8.001f, 14.501f, 9.121f, 14.501f, 10.501f)
                curveTo(14.501f, 11.621f, 13.761f, 12.551f, 12.751f, 12.871f)
                close()
            }
        }.build()

        return _ShieldSecurity!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSecurity: ImageVector? = null
