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

val Iconsax.Outline.RotateRight: ImageVector
    get() {
        if (_RotateRight != null) {
            return _RotateRight!!
        }
        _RotateRight = ImageVector.Builder(
            name = "Outline.RotateRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.8f, 22.75f, 2.58f, 18.52f, 2.58f, 13.33f)
                curveTo(2.58f, 8.14f, 6.8f, 3.9f, 12f, 3.9f)
                curveTo(13.07f, 3.9f, 14.11f, 4.05f, 15.11f, 4.36f)
                curveTo(15.51f, 4.48f, 15.73f, 4.9f, 15.61f, 5.3f)
                curveTo(15.49f, 5.7f, 15.07f, 5.92f, 14.67f, 5.8f)
                curveTo(13.82f, 5.54f, 12.92f, 5.4f, 12f, 5.4f)
                curveTo(7.63f, 5.4f, 4.08f, 8.95f, 4.08f, 13.32f)
                curveTo(4.08f, 17.69f, 7.63f, 21.24f, 12f, 21.24f)
                curveTo(16.37f, 21.24f, 19.92f, 17.69f, 19.92f, 13.32f)
                curveTo(19.92f, 11.74f, 19.46f, 10.22f, 18.59f, 8.92f)
                curveTo(18.36f, 8.58f, 18.45f, 8.11f, 18.8f, 7.88f)
                curveTo(19.14f, 7.65f, 19.61f, 7.74f, 19.84f, 8.09f)
                curveTo(20.88f, 9.64f, 21.43f, 11.45f, 21.43f, 13.33f)
                curveTo(21.42f, 18.52f, 17.2f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.13f, 6.07f)
                curveTo(15.92f, 6.07f, 15.71f, 5.98f, 15.56f, 5.81f)
                lineTo(12.67f, 2.49f)
                curveTo(12.4f, 2.18f, 12.43f, 1.7f, 12.74f, 1.43f)
                curveTo(13.05f, 1.16f, 13.53f, 1.19f, 13.8f, 1.5f)
                lineTo(16.69f, 4.82f)
                curveTo(16.96f, 5.13f, 16.93f, 5.61f, 16.62f, 5.88f)
                curveTo(16.49f, 6.01f, 16.31f, 6.07f, 16.13f, 6.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.76f, 8.53f)
                curveTo(12.53f, 8.53f, 12.3f, 8.42f, 12.15f, 8.22f)
                curveTo(11.91f, 7.89f, 11.98f, 7.42f, 12.31f, 7.17f)
                lineTo(15.68f, 4.71f)
                curveTo(16.01f, 4.46f, 16.48f, 4.54f, 16.73f, 4.87f)
                curveTo(16.98f, 5.2f, 16.9f, 5.67f, 16.57f, 5.92f)
                lineTo(13.2f, 8.39f)
                curveTo(13.07f, 8.49f, 12.92f, 8.53f, 12.76f, 8.53f)
                close()
            }
        }.build()

        return _RotateRight!!
    }

@Suppress("ObjectPropertyName")
private var _RotateRight: ImageVector? = null
