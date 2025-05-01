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

val Iconsax.Filled.ThreeSquare: ImageVector
    get() {
        if (_3Square != null) {
            return _3Square!!
        }
        _3Square = ImageVector.Builder(
            name = "Filled.3Square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.5f)
                verticalLineTo(19.38f)
                curveTo(12f, 21.25f, 11.25f, 22f, 9.37f, 22f)
                horizontalLineTo(4.62f)
                curveTo(3.17f, 22f, 2f, 20.83f, 2f, 19.38f)
                verticalLineTo(14.63f)
                curveTo(2f, 12.75f, 2.75f, 12f, 4.62f, 12f)
                horizontalLineTo(5.5f)
                verticalLineTo(15.5f)
                curveTo(5.5f, 17.16f, 6.84f, 18.5f, 8.5f, 18.5f)
                horizontalLineTo(12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 13.5f)
                verticalLineTo(14.37f)
                curveTo(17f, 15.82f, 15.82f, 17f, 14.37f, 17f)
                horizontalLineTo(9.62f)
                curveTo(7.75f, 17f, 7f, 16.25f, 7f, 14.37f)
                verticalLineTo(9.62f)
                curveTo(7f, 8.17f, 8.17f, 7f, 9.62f, 7f)
                horizontalLineTo(10.5f)
                verticalLineTo(10.5f)
                curveTo(10.5f, 12.16f, 11.84f, 13.5f, 13.5f, 13.5f)
                horizontalLineTo(17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 4.62f)
                verticalLineTo(9.37f)
                curveTo(22f, 11.25f, 21.25f, 12f, 19.37f, 12f)
                horizontalLineTo(14.62f)
                curveTo(12.75f, 12f, 12f, 11.25f, 12f, 9.37f)
                verticalLineTo(4.62f)
                curveTo(12f, 2.75f, 12.75f, 2f, 14.62f, 2f)
                horizontalLineTo(19.37f)
                curveTo(21.25f, 2f, 22f, 2.75f, 22f, 4.62f)
                close()
            }
        }.build()

        return _3Square!!
    }

@Suppress("ObjectPropertyName")
private var _3Square: ImageVector? = null
