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

val Iconsax.Outline.ArrangeSquare: ImageVector
    get() {
        if (_ArrangeSquare != null) {
            return _ArrangeSquare!!
        }
        _ArrangeSquare = ImageVector.Builder(
            name = "Outline.ArrangeSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.111f, 17.61f)
                curveTo(13.921f, 17.61f, 13.731f, 17.54f, 13.581f, 17.39f)
                curveTo(13.291f, 17.1f, 13.291f, 16.62f, 13.581f, 16.33f)
                lineTo(16.621f, 13.29f)
                curveTo(16.911f, 13f, 17.391f, 13f, 17.681f, 13.29f)
                curveTo(17.971f, 13.58f, 17.971f, 14.06f, 17.681f, 14.35f)
                lineTo(14.641f, 17.39f)
                curveTo(14.501f, 17.53f, 14.311f, 17.61f, 14.111f, 17.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.15f, 14.57f)
                horizontalLineTo(6.85f)
                curveTo(6.44f, 14.57f, 6.1f, 14.23f, 6.1f, 13.82f)
                curveTo(6.1f, 13.41f, 6.44f, 13.07f, 6.85f, 13.07f)
                horizontalLineTo(17.16f)
                curveTo(17.57f, 13.07f, 17.91f, 13.41f, 17.91f, 13.82f)
                curveTo(17.91f, 14.23f, 17.57f, 14.57f, 17.15f, 14.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.849f, 10.93f)
                curveTo(6.659f, 10.93f, 6.469f, 10.86f, 6.319f, 10.71f)
                curveTo(6.029f, 10.42f, 6.029f, 9.94f, 6.319f, 9.65f)
                lineTo(9.359f, 6.61f)
                curveTo(9.649f, 6.32f, 10.129f, 6.32f, 10.419f, 6.61f)
                curveTo(10.709f, 6.9f, 10.709f, 7.38f, 10.419f, 7.67f)
                lineTo(7.379f, 10.71f)
                curveTo(7.229f, 10.86f, 7.039f, 10.93f, 6.849f, 10.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.15f, 10.93f)
                horizontalLineTo(6.85f)
                curveTo(6.44f, 10.93f, 6.1f, 10.59f, 6.1f, 10.18f)
                curveTo(6.1f, 9.77f, 6.44f, 9.43f, 6.85f, 9.43f)
                horizontalLineTo(17.16f)
                curveTo(17.57f, 9.43f, 17.91f, 9.77f, 17.91f, 10.18f)
                curveTo(17.91f, 10.59f, 17.57f, 10.93f, 17.15f, 10.93f)
                close()
            }
        }.build()

        return _ArrangeSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ArrangeSquare: ImageVector? = null
