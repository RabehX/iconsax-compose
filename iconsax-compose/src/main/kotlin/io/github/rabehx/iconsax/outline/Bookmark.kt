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

val Iconsax.Outline.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) {
            return _Bookmark!!
        }
        _Bookmark = ImageVector.Builder(
            name = "Outline.Bookmark",
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
                moveTo(8.68f, 15.33f)
                curveTo(8.26f, 15.33f, 7.87f, 15.23f, 7.53f, 15.04f)
                curveTo(6.7f, 14.57f, 6.25f, 13.64f, 6.25f, 12.42f)
                verticalLineTo(2.44f)
                curveTo(6.25f, 2.03f, 6.59f, 1.69f, 7f, 1.69f)
                curveTo(7.41f, 1.69f, 7.75f, 2.03f, 7.75f, 2.44f)
                verticalLineTo(12.42f)
                curveTo(7.75f, 13.07f, 7.94f, 13.55f, 8.27f, 13.73f)
                curveTo(8.62f, 13.93f, 9.16f, 13.83f, 9.75f, 13.48f)
                lineTo(11.07f, 12.69f)
                curveTo(11.61f, 12.37f, 12.38f, 12.37f, 12.92f, 12.69f)
                lineTo(14.24f, 13.48f)
                curveTo(14.84f, 13.84f, 15.38f, 13.93f, 15.72f, 13.73f)
                curveTo(16.05f, 13.54f, 16.24f, 13.06f, 16.24f, 12.42f)
                verticalLineTo(2.44f)
                curveTo(16.24f, 2.03f, 16.58f, 1.69f, 16.99f, 1.69f)
                curveTo(17.4f, 1.69f, 17.74f, 2.03f, 17.74f, 2.44f)
                verticalLineTo(12.42f)
                curveTo(17.74f, 13.64f, 17.29f, 14.57f, 16.46f, 15.04f)
                curveTo(15.63f, 15.51f, 14.54f, 15.41f, 13.47f, 14.77f)
                lineTo(12.15f, 13.98f)
                curveTo(12.09f, 13.94f, 11.9f, 13.94f, 11.84f, 13.98f)
                lineTo(10.52f, 14.77f)
                curveTo(9.9f, 15.14f, 9.26f, 15.33f, 8.68f, 15.33f)
                close()
            }
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
                moveTo(8.68f, 15.33f)
                curveTo(8.26f, 15.33f, 7.87f, 15.23f, 7.53f, 15.04f)
                curveTo(6.7f, 14.57f, 6.25f, 13.64f, 6.25f, 12.42f)
                verticalLineTo(2.44f)
                curveTo(6.25f, 2.03f, 6.59f, 1.69f, 7f, 1.69f)
                curveTo(7.41f, 1.69f, 7.75f, 2.03f, 7.75f, 2.44f)
                verticalLineTo(12.42f)
                curveTo(7.75f, 13.07f, 7.94f, 13.55f, 8.27f, 13.73f)
                curveTo(8.62f, 13.93f, 9.16f, 13.83f, 9.75f, 13.48f)
                lineTo(11.07f, 12.69f)
                curveTo(11.61f, 12.37f, 12.38f, 12.37f, 12.92f, 12.69f)
                lineTo(14.24f, 13.48f)
                curveTo(14.84f, 13.84f, 15.38f, 13.93f, 15.72f, 13.73f)
                curveTo(16.05f, 13.54f, 16.24f, 13.06f, 16.24f, 12.42f)
                verticalLineTo(2.44f)
                curveTo(16.24f, 2.03f, 16.58f, 1.69f, 16.99f, 1.69f)
                curveTo(17.4f, 1.69f, 17.74f, 2.03f, 17.74f, 2.44f)
                verticalLineTo(12.42f)
                curveTo(17.74f, 13.64f, 17.29f, 14.57f, 16.46f, 15.04f)
                curveTo(15.63f, 15.51f, 14.54f, 15.41f, 13.47f, 14.77f)
                lineTo(12.15f, 13.98f)
                curveTo(12.09f, 13.94f, 11.9f, 13.94f, 11.84f, 13.98f)
                lineTo(10.52f, 14.77f)
                curveTo(9.9f, 15.14f, 9.26f, 15.33f, 8.68f, 15.33f)
                close()
            }
        }.build()

        return _Bookmark!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmark: ImageVector? = null
