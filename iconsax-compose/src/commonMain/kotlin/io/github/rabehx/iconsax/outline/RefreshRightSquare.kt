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

val Iconsax.Outline.RefreshRightSquare: ImageVector
    get() {
        if (_RefreshRightSquare != null) {
            return _RefreshRightSquare!!
        }
        _RefreshRightSquare = ImageVector.Builder(
            name = "Outline.RefreshRightSquare",
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
                moveTo(12f, 18.01f)
                curveTo(8.83f, 18.01f, 6.25f, 15.43f, 6.25f, 12.26f)
                curveTo(6.25f, 9.09f, 8.83f, 6.51f, 12f, 6.51f)
                curveTo(12.64f, 6.51f, 13.28f, 6.6f, 13.89f, 6.79f)
                curveTo(14.29f, 6.91f, 14.51f, 7.33f, 14.39f, 7.73f)
                curveTo(14.27f, 8.13f, 13.85f, 8.35f, 13.45f, 8.23f)
                curveTo(12.99f, 8.09f, 12.5f, 8.02f, 12f, 8.02f)
                curveTo(9.66f, 8.02f, 7.75f, 9.93f, 7.75f, 12.27f)
                curveTo(7.75f, 14.61f, 9.66f, 16.52f, 12f, 16.52f)
                curveTo(14.34f, 16.52f, 16.25f, 14.61f, 16.25f, 12.27f)
                curveTo(16.25f, 11.42f, 16f, 10.61f, 15.54f, 9.91f)
                curveTo(15.31f, 9.57f, 15.4f, 9.1f, 15.75f, 8.87f)
                curveTo(16.09f, 8.64f, 16.56f, 8.73f, 16.79f, 9.08f)
                curveTo(17.42f, 10.03f, 17.76f, 11.13f, 17.76f, 12.27f)
                curveTo(17.75f, 15.44f, 15.17f, 18.01f, 12f, 18.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.381f, 8.4f)
                curveTo(14.171f, 8.4f, 13.961f, 8.31f, 13.811f, 8.14f)
                lineTo(12.141f, 6.23f)
                curveTo(11.871f, 5.92f, 11.901f, 5.44f, 12.211f, 5.17f)
                curveTo(12.521f, 4.9f, 13.001f, 4.93f, 13.271f, 5.24f)
                lineTo(14.941f, 7.15f)
                curveTo(15.211f, 7.46f, 15.181f, 7.94f, 14.871f, 8.21f)
                curveTo(14.731f, 8.34f, 14.561f, 8.4f, 14.381f, 8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.44f, 9.82f)
                curveTo(12.21f, 9.82f, 11.98f, 9.71f, 11.83f, 9.51f)
                curveTo(11.59f, 9.18f, 11.66f, 8.71f, 11.99f, 8.46f)
                lineTo(13.93f, 7.04f)
                curveTo(14.26f, 6.8f, 14.73f, 6.87f, 14.98f, 7.2f)
                curveTo(15.22f, 7.53f, 15.15f, 8f, 14.82f, 8.25f)
                lineTo(12.88f, 9.67f)
                curveTo(12.75f, 9.77f, 12.59f, 9.82f, 12.44f, 9.82f)
                close()
            }
        }.build()

        return _RefreshRightSquare!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshRightSquare: ImageVector? = null
