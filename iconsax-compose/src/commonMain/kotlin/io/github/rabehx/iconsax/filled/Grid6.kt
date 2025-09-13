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


val Iconsax.Filled.Grid6: ImageVector
    get() {
        if (_Grid6 != null) {
            return _Grid6!!
        }
        _Grid6 = ImageVector.Builder(
            name = "Filled.Grid6",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 7.749f)
                horizontalLineTo(9.75f)
                verticalLineTo(1.949f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 1.949f, 22f, 4.119f, 22f, 7.749f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 16.25f)
                curveTo(21.95f, 19.82f, 19.79f, 21.95f, 16.19f, 21.95f)
                horizontalLineTo(9.75f)
                verticalLineTo(16.25f)
                horizontalLineTo(22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.25f, 1.949f)
                verticalLineTo(21.949f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 21.949f, 2f, 19.779f, 2f, 16.139f)
                verticalLineTo(7.759f)
                curveTo(2f, 4.119f, 4.17f, 1.949f, 7.81f, 1.949f)
                horizontalLineTo(8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(14.75f)
                horizontalLineTo(22f)
                verticalLineTo(9.25f)
                close()
            }
        }.build()

        return _Grid6!!
    }

@Suppress("ObjectPropertyName")
private var _Grid6: ImageVector? = null
