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

val Iconsax.Outline.Bookmark2: ImageVector
    get() {
        if (_Bookmark2 != null) {
            return _Bookmark2!!
        }
        _Bookmark2 = ImageVector.Builder(
            name = "Outline.Bookmark2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.31f, 15.02f)
                curveTo(14.73f, 15.02f, 14.1f, 14.83f, 13.47f, 14.44f)
                lineTo(12.15f, 13.64f)
                curveTo(12.09f, 13.6f, 11.91f, 13.6f, 11.85f, 13.64f)
                lineTo(10.53f, 14.44f)
                curveTo(9.45f, 15.1f, 8.39f, 15.2f, 7.54f, 14.72f)
                curveTo(6.71f, 14.25f, 6.25f, 13.31f, 6.25f, 12.08f)
                verticalLineTo(5.03f)
                curveTo(6.25f, 2.59f, 7.58f, 1.25f, 10f, 1.25f)
                horizontalLineTo(14f)
                curveTo(16.42f, 1.25f, 17.75f, 2.59f, 17.75f, 5.03f)
                verticalLineTo(12.08f)
                curveTo(17.75f, 13.32f, 17.29f, 14.26f, 16.46f, 14.72f)
                curveTo(16.11f, 14.92f, 15.72f, 15.02f, 15.31f, 15.02f)
                close()
                moveTo(12f, 12.11f)
                curveTo(12.33f, 12.11f, 12.66f, 12.19f, 12.93f, 12.35f)
                lineTo(14.25f, 13.15f)
                curveTo(14.84f, 13.51f, 15.38f, 13.6f, 15.72f, 13.41f)
                curveTo(16.05f, 13.22f, 16.24f, 12.73f, 16.24f, 12.07f)
                verticalLineTo(5.03f)
                curveTo(16.24f, 3.43f, 15.57f, 2.75f, 13.99f, 2.75f)
                horizontalLineTo(9.99f)
                curveTo(8.41f, 2.75f, 7.74f, 3.43f, 7.74f, 5.03f)
                verticalLineTo(12.08f)
                curveTo(7.74f, 12.74f, 7.93f, 13.23f, 8.26f, 13.42f)
                curveTo(8.6f, 13.61f, 9.14f, 13.52f, 9.73f, 13.16f)
                lineTo(11.05f, 12.36f)
                curveTo(11.34f, 12.19f, 11.67f, 12.11f, 12f, 12.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.41f, 1.25f, 14.93f)
                verticalLineTo(11.9f)
                curveTo(1.25f, 7.24f, 2.93f, 4.88f, 6.69f, 4.25f)
                curveTo(7.09f, 4.18f, 7.48f, 4.46f, 7.55f, 4.87f)
                curveTo(7.62f, 5.28f, 7.34f, 5.66f, 6.93f, 5.73f)
                curveTo(3.92f, 6.23f, 2.74f, 7.96f, 2.74f, 11.9f)
                verticalLineTo(14.93f)
                curveTo(2.74f, 19.54f, 4.43f, 21.25f, 8.99f, 21.25f)
                horizontalLineTo(14.99f)
                curveTo(19.55f, 21.25f, 21.24f, 19.54f, 21.24f, 14.93f)
                verticalLineTo(11.9f)
                curveTo(21.24f, 7.9f, 20.02f, 6.17f, 16.88f, 5.7f)
                curveTo(16.47f, 5.64f, 16.19f, 5.26f, 16.25f, 4.85f)
                curveTo(16.31f, 4.44f, 16.69f, 4.16f, 17.1f, 4.22f)
                curveTo(21f, 4.8f, 22.74f, 7.16f, 22.74f, 11.9f)
                verticalLineTo(14.93f)
                curveTo(22.75f, 20.41f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
        }.build()

        return _Bookmark2!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmark2: ImageVector? = null
