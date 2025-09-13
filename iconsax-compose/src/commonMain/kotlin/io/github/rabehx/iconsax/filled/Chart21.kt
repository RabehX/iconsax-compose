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


val Iconsax.Filled.Chart21: ImageVector
    get() {
        if (_Chart21 != null) {
            return _Chart21!!
        }
        _Chart21 = ImageVector.Builder(
            name = "Filled.Chart21",
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
                moveTo(9.91f, 16.19f)
                curveTo(9.91f, 16.83f, 9.39f, 17.35f, 8.74f, 17.35f)
                curveTo(8.1f, 17.35f, 7.58f, 16.83f, 7.58f, 16.19f)
                verticalLineTo(12.93f)
                curveTo(7.58f, 12.29f, 8.1f, 11.77f, 8.74f, 11.77f)
                curveTo(9.39f, 11.77f, 9.91f, 12.29f, 9.91f, 12.93f)
                verticalLineTo(16.19f)
                close()
                moveTo(16.42f, 16.19f)
                curveTo(16.42f, 16.83f, 15.9f, 17.35f, 15.26f, 17.35f)
                curveTo(14.61f, 17.35f, 14.09f, 16.83f, 14.09f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(14.09f, 7.17f, 14.61f, 6.65f, 15.26f, 6.65f)
                curveTo(15.9f, 6.65f, 16.42f, 7.17f, 16.42f, 7.81f)
                verticalLineTo(16.19f)
                close()
            }
        }.build()

        return _Chart21!!
    }

@Suppress("ObjectPropertyName")
private var _Chart21: ImageVector? = null
