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


val Iconsax.Filled.Element3: ImageVector
    get() {
        if (_Element3 != null) {
            return _Element3!!
        }
        _Element3 = ImageVector.Builder(
            name = "Filled.Element3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 8.52f)
                verticalLineTo(3.98f)
                curveTo(22f, 2.57f, 21.36f, 2f, 19.77f, 2f)
                horizontalLineTo(15.73f)
                curveTo(14.14f, 2f, 13.5f, 2.57f, 13.5f, 3.98f)
                verticalLineTo(8.51f)
                curveTo(13.5f, 9.93f, 14.14f, 10.49f, 15.73f, 10.49f)
                horizontalLineTo(19.77f)
                curveTo(21.36f, 10.5f, 22f, 9.93f, 22f, 8.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 19.77f)
                verticalLineTo(15.73f)
                curveTo(22f, 14.14f, 21.36f, 13.5f, 19.77f, 13.5f)
                horizontalLineTo(15.73f)
                curveTo(14.14f, 13.5f, 13.5f, 14.14f, 13.5f, 15.73f)
                verticalLineTo(19.77f)
                curveTo(13.5f, 21.36f, 14.14f, 22f, 15.73f, 22f)
                horizontalLineTo(19.77f)
                curveTo(21.36f, 22f, 22f, 21.36f, 22f, 19.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.5f, 8.52f)
                verticalLineTo(3.98f)
                curveTo(10.5f, 2.57f, 9.86f, 2f, 8.27f, 2f)
                horizontalLineTo(4.23f)
                curveTo(2.64f, 2f, 2f, 2.57f, 2f, 3.98f)
                verticalLineTo(8.51f)
                curveTo(2f, 9.93f, 2.64f, 10.49f, 4.23f, 10.49f)
                horizontalLineTo(8.27f)
                curveTo(9.86f, 10.5f, 10.5f, 9.93f, 10.5f, 8.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.5f, 19.77f)
                verticalLineTo(15.73f)
                curveTo(10.5f, 14.14f, 9.86f, 13.5f, 8.27f, 13.5f)
                horizontalLineTo(4.23f)
                curveTo(2.64f, 13.5f, 2f, 14.14f, 2f, 15.73f)
                verticalLineTo(19.77f)
                curveTo(2f, 21.36f, 2.64f, 22f, 4.23f, 22f)
                horizontalLineTo(8.27f)
                curveTo(9.86f, 22f, 10.5f, 21.36f, 10.5f, 19.77f)
                close()
            }
        }.build()

        return _Element3!!
    }

@Suppress("ObjectPropertyName")
private var _Element3: ImageVector? = null
