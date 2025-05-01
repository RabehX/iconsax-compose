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


val Iconsax.Filled.More: ImageVector
    get() {
        if (_More != null) {
            return _More!!
        }
        _More = ImageVector.Builder(
            name = "Filled.More",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(7f, 13.31f)
                curveTo(6.28f, 13.31f, 5.69f, 12.72f, 5.69f, 12f)
                curveTo(5.69f, 11.28f, 6.28f, 10.69f, 7f, 10.69f)
                curveTo(7.72f, 10.69f, 8.31f, 11.28f, 8.31f, 12f)
                curveTo(8.31f, 12.72f, 7.72f, 13.31f, 7f, 13.31f)
                close()
                moveTo(12f, 13.31f)
                curveTo(11.28f, 13.31f, 10.69f, 12.72f, 10.69f, 12f)
                curveTo(10.69f, 11.28f, 11.28f, 10.69f, 12f, 10.69f)
                curveTo(12.72f, 10.69f, 13.31f, 11.28f, 13.31f, 12f)
                curveTo(13.31f, 12.72f, 12.72f, 13.31f, 12f, 13.31f)
                close()
                moveTo(17f, 13.31f)
                curveTo(16.28f, 13.31f, 15.69f, 12.72f, 15.69f, 12f)
                curveTo(15.69f, 11.28f, 16.28f, 10.69f, 17f, 10.69f)
                curveTo(17.72f, 10.69f, 18.31f, 11.28f, 18.31f, 12f)
                curveTo(18.31f, 12.72f, 17.72f, 13.31f, 17f, 13.31f)
                close()
            }
        }.build()

        return _More!!
    }

@Suppress("ObjectPropertyName")
private var _More: ImageVector? = null
