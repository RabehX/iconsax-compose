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

val Iconsax.Outline.KeySquare: ImageVector
    get() {
        if (_KeySquare != null) {
            return _KeySquare!!
        }
        _KeySquare = ImageVector.Builder(
            name = "Outline.KeySquare",
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
                moveTo(8.81f, 18.25f)
                curveTo(8.74f, 18.25f, 8.66f, 18.25f, 8.59f, 18.23f)
                lineTo(7.4f, 18.07f)
                curveTo(6.68f, 17.97f, 6.05f, 17.35f, 5.94f, 16.61f)
                lineTo(5.77f, 15.4f)
                curveTo(5.7f, 14.92f, 5.9f, 14.31f, 6.25f, 13.95f)
                lineTo(8.53f, 11.67f)
                curveTo(8.19f, 10.05f, 8.68f, 8.37f, 9.87f, 7.19f)
                curveTo(11.78f, 5.28f, 14.9f, 5.28f, 16.81f, 7.19f)
                curveTo(17.74f, 8.12f, 18.25f, 9.35f, 18.25f, 10.66f)
                curveTo(18.25f, 11.97f, 17.74f, 13.21f, 16.81f, 14.13f)
                curveTo(15.62f, 15.31f, 13.94f, 15.8f, 12.33f, 15.46f)
                lineTo(10.04f, 17.74f)
                curveTo(9.75f, 18.05f, 9.26f, 18.25f, 8.81f, 18.25f)
                close()
                moveTo(13.34f, 7.25f)
                curveTo(12.47f, 7.25f, 11.59f, 7.58f, 10.93f, 8.25f)
                curveTo(10.03f, 9.15f, 9.71f, 10.46f, 10.08f, 11.68f)
                curveTo(10.16f, 11.95f, 10.09f, 12.23f, 9.89f, 12.43f)
                lineTo(7.31f, 15.01f)
                curveTo(7.29f, 15.04f, 7.25f, 15.15f, 7.25f, 15.19f)
                lineTo(7.42f, 16.39f)
                curveTo(7.43f, 16.45f, 7.54f, 16.56f, 7.6f, 16.57f)
                lineTo(8.8f, 16.74f)
                curveTo(8.85f, 16.73f, 8.95f, 16.71f, 8.98f, 16.68f)
                lineTo(11.57f, 14.09f)
                curveTo(11.77f, 13.89f, 12.06f, 13.83f, 12.32f, 13.91f)
                curveTo(13.53f, 14.29f, 14.84f, 13.97f, 15.74f, 13.07f)
                curveTo(16.38f, 12.43f, 16.74f, 11.57f, 16.74f, 10.66f)
                curveTo(16.74f, 9.75f, 16.39f, 8.89f, 15.74f, 8.25f)
                curveTo(15.09f, 7.59f, 14.21f, 7.25f, 13.34f, 7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.449f, 17.03f)
                curveTo(10.259f, 17.03f, 10.069f, 16.96f, 9.919f, 16.81f)
                lineTo(9.059f, 15.95f)
                curveTo(8.769f, 15.66f, 8.769f, 15.18f, 9.059f, 14.89f)
                curveTo(9.349f, 14.6f, 9.829f, 14.6f, 10.119f, 14.89f)
                lineTo(10.979f, 15.75f)
                curveTo(11.269f, 16.04f, 11.269f, 16.52f, 10.979f, 16.81f)
                curveTo(10.839f, 16.96f, 10.649f, 17.03f, 10.449f, 17.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.379f, 11.8f)
                curveTo(13.239f, 11.8f, 13.109f, 11.78f, 12.989f, 11.73f)
                curveTo(12.869f, 11.68f, 12.759f, 11.6f, 12.669f, 11.51f)
                curveTo(12.479f, 11.32f, 12.369f, 11.07f, 12.369f, 10.8f)
                curveTo(12.369f, 10.54f, 12.479f, 10.28f, 12.669f, 10.1f)
                curveTo(12.899f, 9.86f, 13.249f, 9.75f, 13.569f, 9.82f)
                curveTo(13.629f, 9.84f, 13.699f, 9.85f, 13.759f, 9.88f)
                curveTo(13.819f, 9.91f, 13.879f, 9.94f, 13.929f, 9.97f)
                curveTo(13.979f, 10.01f, 14.039f, 10.05f, 14.079f, 10.1f)
                curveTo(14.269f, 10.28f, 14.379f, 10.54f, 14.379f, 10.8f)
                curveTo(14.379f, 10.94f, 14.349f, 11.06f, 14.299f, 11.19f)
                curveTo(14.249f, 11.31f, 14.179f, 11.42f, 14.079f, 11.51f)
                curveTo(13.889f, 11.7f, 13.639f, 11.8f, 13.379f, 11.8f)
                close()
            }
        }.build()

        return _KeySquare!!
    }

@Suppress("ObjectPropertyName")
private var _KeySquare: ImageVector? = null
