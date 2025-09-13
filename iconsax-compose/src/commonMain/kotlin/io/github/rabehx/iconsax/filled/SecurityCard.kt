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


val Iconsax.Filled.SecurityCard: ImageVector
    get() {
        if (_SecurityCard != null) {
            return _SecurityCard!!
        }
        _SecurityCard = ImageVector.Builder(
            name = "Filled.SecurityCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.491f, 13.379f)
                horizontalLineTo(11.001f)
                curveTo(10.701f, 13.379f, 10.461f, 13.619f, 10.461f, 13.919f)
                curveTo(10.461f, 14.219f, 10.701f, 14.459f, 11.001f, 14.459f)
                horizontalLineTo(13.491f)
                curveTo(13.791f, 14.459f, 14.031f, 14.219f, 14.031f, 13.919f)
                curveTo(14.031f, 13.619f, 13.791f, 13.379f, 13.491f, 13.379f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.438f, 13.379f)
                horizontalLineTo(8.188f)
                curveTo(7.888f, 13.379f, 7.648f, 13.619f, 7.648f, 13.919f)
                curveTo(7.648f, 14.219f, 7.888f, 14.459f, 8.188f, 14.459f)
                horizontalLineTo(9.438f)
                curveTo(9.738f, 14.459f, 9.978f, 14.219f, 9.978f, 13.919f)
                curveTo(9.978f, 13.619f, 9.738f, 13.379f, 9.438f, 13.379f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.541f, 4.221f)
                lineTo(13.041f, 2.161f)
                curveTo(12.471f, 1.951f, 11.541f, 1.951f, 10.971f, 2.161f)
                lineTo(5.471f, 4.221f)
                curveTo(4.411f, 4.621f, 3.551f, 5.861f, 3.551f, 6.991f)
                verticalLineTo(15.091f)
                curveTo(3.551f, 15.901f, 4.081f, 16.971f, 4.731f, 17.451f)
                lineTo(10.231f, 21.561f)
                curveTo(11.201f, 22.291f, 12.791f, 22.291f, 13.761f, 21.561f)
                lineTo(19.261f, 17.451f)
                curveTo(19.911f, 16.961f, 20.441f, 15.901f, 20.441f, 15.091f)
                verticalLineTo(6.991f)
                curveTo(20.451f, 5.861f, 19.591f, 4.621f, 18.541f, 4.221f)
                close()
                moveTo(18.171f, 13.651f)
                curveTo(18.151f, 15.721f, 17.581f, 16.241f, 15.431f, 16.241f)
                horizontalLineTo(8.581f)
                curveTo(6.391f, 16.241f, 5.841f, 15.701f, 5.841f, 13.531f)
                verticalLineTo(11.201f)
                curveTo(5.841f, 10.921f, 6.061f, 10.701f, 6.341f, 10.701f)
                horizontalLineTo(17.671f)
                curveTo(17.951f, 10.701f, 18.171f, 10.921f, 18.171f, 11.201f)
                verticalLineTo(13.651f)
                close()
                moveTo(18.171f, 9.111f)
                curveTo(18.171f, 9.391f, 17.951f, 9.611f, 17.671f, 9.611f)
                horizontalLineTo(6.341f)
                curveTo(6.061f, 9.611f, 5.841f, 9.391f, 5.841f, 9.111f)
                verticalLineTo(8.471f)
                curveTo(5.841f, 6.511f, 6.301f, 5.881f, 8.011f, 5.771f)
                curveTo(8.191f, 5.771f, 8.381f, 5.761f, 8.581f, 5.761f)
                horizontalLineTo(15.431f)
                curveTo(17.621f, 5.761f, 18.171f, 6.301f, 18.171f, 8.471f)
                verticalLineTo(9.111f)
                close()
            }
        }.build()

        return _SecurityCard!!
    }

@Suppress("ObjectPropertyName")
private var _SecurityCard: ImageVector? = null
