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

val Iconsax.Outline.BackSquare: ImageVector
    get() {
        if (_BackSquare != null) {
            return _BackSquare!!
        }
        _BackSquare = ImageVector.Builder(
            name = "Outline.BackSquare",
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
                moveTo(13.92f, 16.13f)
                horizontalLineTo(9f)
                curveTo(8.59f, 16.13f, 8.25f, 15.79f, 8.25f, 15.38f)
                curveTo(8.25f, 14.97f, 8.59f, 14.63f, 9f, 14.63f)
                horizontalLineTo(13.92f)
                curveTo(15.2f, 14.63f, 16.25f, 13.59f, 16.25f, 12.3f)
                curveTo(16.25f, 11.01f, 15.21f, 9.97f, 13.92f, 9.97f)
                horizontalLineTo(7.15f)
                curveTo(6.74f, 9.97f, 6.4f, 9.63f, 6.4f, 9.22f)
                curveTo(6.4f, 8.81f, 6.74f, 8.47f, 7.15f, 8.47f)
                horizontalLineTo(13.92f)
                curveTo(16.03f, 8.47f, 17.75f, 10.19f, 17.75f, 12.3f)
                curveTo(17.75f, 14.41f, 16.03f, 16.13f, 13.92f, 16.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.569f, 11.52f)
                curveTo(8.379f, 11.52f, 8.189f, 11.45f, 8.039f, 11.3f)
                lineTo(6.469f, 9.73f)
                curveTo(6.179f, 9.44f, 6.179f, 8.96f, 6.469f, 8.67f)
                lineTo(8.039f, 7.1f)
                curveTo(8.329f, 6.81f, 8.809f, 6.81f, 9.099f, 7.1f)
                curveTo(9.389f, 7.39f, 9.389f, 7.87f, 9.099f, 8.16f)
                lineTo(8.059f, 9.2f)
                lineTo(9.099f, 10.24f)
                curveTo(9.389f, 10.53f, 9.389f, 11.01f, 9.099f, 11.3f)
                curveTo(8.959f, 11.44f, 8.769f, 11.52f, 8.569f, 11.52f)
                close()
            }
        }.build()

        return _BackSquare!!
    }

@Suppress("ObjectPropertyName")
private var _BackSquare: ImageVector? = null
