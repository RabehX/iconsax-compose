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


val Iconsax.Filled.Man: ImageVector
    get() {
        if (_Man != null) {
            return _Man!!
        }
        _Man = ImageVector.Builder(
            name = "Filled.Man",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.19f, 2.21f)
                curveTo(22.12f, 2.03f, 21.97f, 1.88f, 21.79f, 1.81f)
                curveTo(21.69f, 1.77f, 21.6f, 1.75f, 21.5f, 1.75f)
                horizontalLineTo(15f)
                curveTo(14.59f, 1.75f, 14.25f, 2.09f, 14.25f, 2.5f)
                curveTo(14.25f, 2.91f, 14.59f, 3.25f, 15f, 3.25f)
                horizontalLineTo(19.69f)
                lineTo(15.18f, 7.77f)
                horizontalLineTo(15.17f)
                curveTo(13.83f, 6.66f, 12.12f, 6f, 10.25f, 6f)
                curveTo(5.97f, 6f, 2.5f, 9.47f, 2.5f, 13.75f)
                curveTo(2.5f, 18.03f, 5.97f, 21.5f, 10.25f, 21.5f)
                curveTo(14.53f, 21.5f, 18f, 18.03f, 18f, 13.75f)
                curveTo(18f, 11.88f, 17.34f, 10.17f, 16.23f, 8.83f)
                lineTo(20.75f, 4.31f)
                verticalLineTo(9f)
                curveTo(20.75f, 9.41f, 21.09f, 9.75f, 21.5f, 9.75f)
                curveTo(21.91f, 9.75f, 22.25f, 9.41f, 22.25f, 9f)
                verticalLineTo(2.5f)
                curveTo(22.25f, 2.4f, 22.23f, 2.31f, 22.19f, 2.21f)
                close()
            }
        }.build()

        return _Man!!
    }

@Suppress("ObjectPropertyName")
private var _Man: ImageVector? = null
