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


val Iconsax.Filled.DocumentNormal: ImageVector
    get() {
        if (_DocumentNormal != null) {
            return _DocumentNormal!!
        }
        _DocumentNormal = ImageVector.Builder(
            name = "Filled.DocumentNormal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.709f, 8.119f)
                verticalLineTo(17.529f)
                curveTo(20.709f, 19.99f, 18.699f, 22f, 16.239f, 22f)
                horizontalLineTo(7.759f)
                curveTo(5.299f, 22f, 3.289f, 19.99f, 3.289f, 17.529f)
                verticalLineTo(8.119f)
                curveTo(3.289f, 6.409f, 4.249f, 4.919f, 5.659f, 4.169f)
                curveTo(6.149f, 3.909f, 6.759f, 4.259f, 6.759f, 4.819f)
                curveTo(6.759f, 6.409f, 8.059f, 7.709f, 9.649f, 7.709f)
                horizontalLineTo(14.349f)
                curveTo(15.939f, 7.709f, 17.239f, 6.409f, 17.239f, 4.819f)
                curveTo(17.239f, 4.259f, 17.839f, 3.909f, 18.339f, 4.169f)
                curveTo(19.749f, 4.919f, 20.709f, 6.409f, 20.709f, 8.119f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.35f, 2f)
                horizontalLineTo(9.65f)
                curveTo(8.61f, 2f, 7.76f, 2.84f, 7.76f, 3.88f)
                verticalLineTo(4.82f)
                curveTo(7.76f, 5.86f, 8.6f, 6.7f, 9.64f, 6.7f)
                horizontalLineTo(14.35f)
                curveTo(15.39f, 6.7f, 16.23f, 5.86f, 16.23f, 4.82f)
                verticalLineTo(3.88f)
                curveTo(16.24f, 2.84f, 15.39f, 2f, 14.35f, 2f)
                close()
            }
        }.build()

        return _DocumentNormal!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentNormal: ImageVector? = null
