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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.ForwardItem: ImageVector
    get() {
        if (_ForwardItem != null) {
            return _ForwardItem!!
        }
        _ForwardItem = ImageVector.Builder(
            name = "Outline.ForwardItem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.621f, 18.13f)
                horizontalLineTo(10.391f)
                curveTo(7.261f, 18.13f, 5.871f, 16.74f, 5.871f, 13.61f)
                verticalLineTo(10.38f)
                curveTo(5.871f, 7.25f, 7.261f, 5.86f, 10.391f, 5.86f)
                horizontalLineTo(13.621f)
                curveTo(16.751f, 5.86f, 18.141f, 7.25f, 18.141f, 10.38f)
                verticalLineTo(13.61f)
                curveTo(18.131f, 16.74f, 16.741f, 18.13f, 13.621f, 18.13f)
                close()
                moveTo(10.381f, 7.37f)
                curveTo(8.091f, 7.37f, 7.361f, 8.1f, 7.361f, 10.39f)
                verticalLineTo(13.62f)
                curveTo(7.361f, 15.91f, 8.091f, 16.64f, 10.381f, 16.64f)
                horizontalLineTo(13.611f)
                curveTo(15.901f, 16.64f, 16.631f, 15.91f, 16.631f, 13.62f)
                verticalLineTo(10.39f)
                curveTo(16.631f, 8.1f, 15.901f, 7.37f, 13.611f, 7.37f)
                horizontalLineTo(10.381f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.23f, 13.52f)
                horizontalLineTo(17.381f)
                curveTo(16.971f, 13.52f, 16.631f, 13.18f, 16.631f, 12.77f)
                verticalLineTo(10.39f)
                curveTo(16.631f, 8.1f, 15.901f, 7.37f, 13.611f, 7.37f)
                horizontalLineTo(11.231f)
                curveTo(10.821f, 7.37f, 10.481f, 7.03f, 10.481f, 6.62f)
                verticalLineTo(5.77f)
                curveTo(10.481f, 2.64f, 11.87f, 1.25f, 15f, 1.25f)
                horizontalLineTo(18.23f)
                curveTo(21.361f, 1.25f, 22.75f, 2.64f, 22.75f, 5.77f)
                verticalLineTo(9f)
                curveTo(22.75f, 12.13f, 21.361f, 13.52f, 18.23f, 13.52f)
                close()
                moveTo(18.131f, 12.02f)
                horizontalLineTo(18.23f)
                curveTo(20.521f, 12.02f, 21.25f, 11.29f, 21.25f, 9f)
                verticalLineTo(5.77f)
                curveTo(21.25f, 3.48f, 20.521f, 2.75f, 18.23f, 2.75f)
                horizontalLineTo(15f)
                curveTo(12.71f, 2.75f, 11.981f, 3.48f, 11.981f, 5.77f)
                verticalLineTo(5.87f)
                horizontalLineTo(13.611f)
                curveTo(16.74f, 5.87f, 18.131f, 7.26f, 18.131f, 10.39f)
                verticalLineTo(12.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 22.75f)
                horizontalLineTo(5.77f)
                curveTo(2.64f, 22.75f, 1.25f, 21.36f, 1.25f, 18.23f)
                verticalLineTo(15f)
                curveTo(1.25f, 11.87f, 2.64f, 10.48f, 5.77f, 10.48f)
                horizontalLineTo(6.62f)
                curveTo(7.03f, 10.48f, 7.37f, 10.82f, 7.37f, 11.23f)
                verticalLineTo(13.61f)
                curveTo(7.37f, 15.9f, 8.1f, 16.63f, 10.39f, 16.63f)
                horizontalLineTo(12.77f)
                curveTo(13.18f, 16.63f, 13.52f, 16.97f, 13.52f, 17.38f)
                verticalLineTo(18.23f)
                curveTo(13.52f, 21.36f, 12.13f, 22.75f, 9f, 22.75f)
                close()
                moveTo(5.77f, 11.98f)
                curveTo(3.48f, 11.98f, 2.75f, 12.71f, 2.75f, 15f)
                verticalLineTo(18.23f)
                curveTo(2.75f, 20.52f, 3.48f, 21.25f, 5.77f, 21.25f)
                horizontalLineTo(9f)
                curveTo(11.29f, 21.25f, 12.02f, 20.52f, 12.02f, 18.23f)
                verticalLineTo(18.13f)
                horizontalLineTo(10.39f)
                curveTo(7.26f, 18.13f, 5.87f, 16.74f, 5.87f, 13.61f)
                verticalLineTo(11.98f)
                horizontalLineTo(5.77f)
                close()
            }
        }.build()

        return _ForwardItem!!
    }

@Suppress("ObjectPropertyName")
private var _ForwardItem: ImageVector? = null
