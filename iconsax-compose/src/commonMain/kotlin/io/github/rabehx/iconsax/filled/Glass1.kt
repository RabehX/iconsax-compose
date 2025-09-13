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


val Iconsax.Filled.Glass1: ImageVector
    get() {
        if (_Glass1 != null) {
            return _Glass1!!
        }
        _Glass1 = ImageVector.Builder(
            name = "Filled.Glass1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.71f, 2f)
                horizontalLineTo(16.76f)
                curveTo(16.37f, 2f, 16.05f, 2.32f, 16.05f, 2.71f)
                curveTo(16.05f, 3.11f, 16.37f, 3.43f, 16.76f, 3.43f)
                horizontalLineTo(17.71f)
                curveTo(19.42f, 3.43f, 20.81f, 4.82f, 20.81f, 6.52f)
                verticalLineTo(12.4f)
                curveTo(20.45f, 12.21f, 20.05f, 12.11f, 19.62f, 12.11f)
                horizontalLineTo(15.81f)
                curveTo(14.37f, 12.11f, 13.19f, 13.28f, 13.19f, 14.73f)
                verticalLineTo(16.29f)
                horizontalLineTo(10.81f)
                verticalLineTo(14.73f)
                curveTo(10.81f, 13.28f, 9.63f, 12.11f, 8.19f, 12.11f)
                horizontalLineTo(4.38f)
                curveTo(3.95f, 12.11f, 3.55f, 12.21f, 3.19f, 12.4f)
                verticalLineTo(6.52f)
                curveTo(3.19f, 4.82f, 4.58f, 3.43f, 6.29f, 3.43f)
                horizontalLineTo(7.24f)
                curveTo(7.63f, 3.43f, 7.95f, 3.11f, 7.95f, 2.71f)
                curveTo(7.95f, 2.32f, 7.63f, 2f, 7.24f, 2f)
                horizontalLineTo(6.29f)
                curveTo(3.79f, 2f, 1.76f, 4.03f, 1.76f, 6.52f)
                verticalLineTo(14.73f)
                verticalLineTo(19.38f)
                curveTo(1.76f, 20.83f, 2.94f, 22f, 4.38f, 22f)
                horizontalLineTo(8.19f)
                curveTo(9.63f, 22f, 10.81f, 20.83f, 10.81f, 19.38f)
                verticalLineTo(17.71f)
                horizontalLineTo(13.19f)
                verticalLineTo(19.38f)
                curveTo(13.19f, 20.83f, 14.37f, 22f, 15.81f, 22f)
                horizontalLineTo(19.62f)
                curveTo(21.06f, 22f, 22.24f, 20.83f, 22.24f, 19.38f)
                verticalLineTo(14.73f)
                verticalLineTo(6.52f)
                curveTo(22.24f, 4.03f, 20.21f, 2f, 17.71f, 2f)
                close()
            }
        }.build()

        return _Glass1!!
    }

@Suppress("ObjectPropertyName")
private var _Glass1: ImageVector? = null
