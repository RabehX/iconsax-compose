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

val Iconsax.Outline.Maximize2: ImageVector
    get() {
        if (_Maximize2 != null) {
            return _Maximize2!!
        }
        _Maximize2 = ImageVector.Builder(
            name = "Outline.Maximize2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 22.75f, 13.25f, 22.41f, 13.25f, 22f)
                curveTo(13.25f, 21.59f, 13.59f, 21.25f, 14f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(9.98f)
                curveTo(2.75f, 10.39f, 2.41f, 10.73f, 2f, 10.73f)
                curveTo(1.59f, 10.73f, 1.25f, 10.39f, 1.25f, 9.98f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 11.75f)
                curveTo(12.809f, 11.75f, 12.62f, 11.68f, 12.469f, 11.53f)
                curveTo(12.179f, 11.24f, 12.179f, 10.76f, 12.469f, 10.47f)
                lineTo(16.209f, 6.72f)
                horizontalLineTo(14f)
                curveTo(13.59f, 6.72f, 13.25f, 6.38f, 13.25f, 5.97f)
                curveTo(13.25f, 5.56f, 13.58f, 5.22f, 14f, 5.22f)
                horizontalLineTo(18.01f)
                curveTo(18.309f, 5.22f, 18.59f, 5.4f, 18.699f, 5.68f)
                curveTo(18.819f, 5.96f, 18.75f, 6.28f, 18.539f, 6.5f)
                lineTo(13.53f, 11.53f)
                curveTo(13.38f, 11.68f, 13.189f, 11.75f, 13f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.01f, 10.74f)
                curveTo(17.6f, 10.74f, 17.26f, 10.4f, 17.26f, 9.99f)
                verticalLineTo(5.97f)
                curveTo(17.26f, 5.56f, 17.6f, 5.22f, 18.01f, 5.22f)
                curveTo(18.42f, 5.22f, 18.76f, 5.56f, 18.76f, 5.97f)
                verticalLineTo(9.98f)
                curveTo(18.76f, 10.4f, 18.42f, 10.74f, 18.01f, 10.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.85f, 22.75f)
                horizontalLineTo(5.15f)
                curveTo(2.49f, 22.75f, 1.25f, 21.51f, 1.25f, 18.85f)
                verticalLineTo(16.15f)
                curveTo(1.25f, 13.49f, 2.49f, 12.25f, 5.15f, 12.25f)
                horizontalLineTo(7.85f)
                curveTo(10.51f, 12.25f, 11.75f, 13.49f, 11.75f, 16.15f)
                verticalLineTo(18.85f)
                curveTo(11.75f, 21.51f, 10.51f, 22.75f, 7.85f, 22.75f)
                close()
                moveTo(5.15f, 13.75f)
                curveTo(3.31f, 13.75f, 2.75f, 14.31f, 2.75f, 16.15f)
                verticalLineTo(18.85f)
                curveTo(2.75f, 20.69f, 3.31f, 21.25f, 5.15f, 21.25f)
                horizontalLineTo(7.85f)
                curveTo(9.69f, 21.25f, 10.25f, 20.69f, 10.25f, 18.85f)
                verticalLineTo(16.15f)
                curveTo(10.25f, 14.31f, 9.69f, 13.75f, 7.85f, 13.75f)
                horizontalLineTo(5.15f)
                close()
            }
        }.build()

        return _Maximize2!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize2: ImageVector? = null
