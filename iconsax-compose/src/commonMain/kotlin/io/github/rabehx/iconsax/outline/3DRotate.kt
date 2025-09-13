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

val Iconsax.Outline.ThreeDRotate: ImageVector
    get() {
        if (_3DRotate != null) {
            return _3DRotate!!
        }
        _3DRotate = ImageVector.Builder(
            name = "Outline.3DRotate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 13.08f)
                curveTo(11.871f, 13.08f, 11.741f, 13.05f, 11.621f, 12.98f)
                lineTo(6.321f, 9.92f)
                curveTo(5.961f, 9.71f, 5.841f, 9.25f, 6.051f, 8.9f)
                curveTo(6.261f, 8.54f, 6.711f, 8.42f, 7.081f, 8.63f)
                lineTo(12.001f, 11.48f)
                lineTo(16.891f, 8.65f)
                curveTo(17.251f, 8.44f, 17.711f, 8.57f, 17.921f, 8.92f)
                curveTo(18.131f, 9.28f, 18.001f, 9.74f, 17.651f, 9.94f)
                lineTo(12.391f, 12.98f)
                curveTo(12.261f, 13.04f, 12.131f, 13.08f, 12.001f, 13.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.52f)
                curveTo(11.59f, 18.52f, 11.25f, 18.18f, 11.25f, 17.77f)
                verticalLineTo(12.33f)
                curveTo(11.25f, 11.92f, 11.59f, 11.58f, 12f, 11.58f)
                curveTo(12.41f, 11.58f, 12.75f, 11.92f, 12.75f, 12.33f)
                verticalLineTo(17.77f)
                curveTo(12.75f, 18.18f, 12.41f, 18.52f, 12f, 18.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.42f, 18.75f, 10.85f, 18.62f, 10.39f, 18.37f)
                lineTo(7.19f, 16.59f)
                curveTo(6.23f, 16.06f, 5.49f, 14.79f, 5.49f, 13.69f)
                verticalLineTo(10.3f)
                curveTo(5.49f, 9.21f, 6.24f, 7.93f, 7.19f, 7.4f)
                lineTo(10.39f, 5.62f)
                curveTo(11.31f, 5.11f, 12.69f, 5.11f, 13.61f, 5.62f)
                lineTo(16.81f, 7.4f)
                curveTo(17.77f, 7.93f, 18.51f, 9.2f, 18.51f, 10.3f)
                verticalLineTo(13.69f)
                curveTo(18.51f, 14.78f, 17.76f, 16.06f, 16.81f, 16.59f)
                lineTo(13.61f, 18.37f)
                curveTo(13.15f, 18.62f, 12.58f, 18.75f, 12f, 18.75f)
                close()
                moveTo(12f, 6.75f)
                curveTo(11.67f, 6.75f, 11.35f, 6.81f, 11.12f, 6.94f)
                lineTo(7.92f, 8.72f)
                curveTo(7.43f, 8.99f, 6.99f, 9.75f, 6.99f, 10.3f)
                verticalLineTo(13.69f)
                curveTo(6.99f, 14.25f, 7.43f, 15f, 7.92f, 15.27f)
                lineTo(11.12f, 17.05f)
                curveTo(11.58f, 17.31f, 12.42f, 17.31f, 12.88f, 17.05f)
                lineTo(16.08f, 15.27f)
                curveTo(16.57f, 15f, 17.01f, 14.24f, 17.01f, 13.69f)
                verticalLineTo(10.3f)
                curveTo(17.01f, 9.74f, 16.57f, 8.99f, 16.08f, 8.72f)
                lineTo(12.88f, 6.94f)
                curveTo(12.65f, 6.81f, 12.33f, 6.75f, 12f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                curveTo(14.73f, 22.75f, 14.48f, 22.6f, 14.35f, 22.37f)
                curveTo(14.22f, 22.13f, 14.22f, 21.85f, 14.36f, 21.61f)
                lineTo(15.41f, 19.86f)
                curveTo(15.62f, 19.51f, 16.08f, 19.39f, 16.44f, 19.6f)
                curveTo(16.8f, 19.81f, 16.91f, 20.27f, 16.7f, 20.63f)
                lineTo(16.43f, 21.08f)
                curveTo(19.19f, 20.43f, 21.26f, 17.95f, 21.26f, 14.99f)
                curveTo(21.26f, 14.58f, 21.6f, 14.24f, 22.01f, 14.24f)
                curveTo(22.42f, 14.24f, 22.76f, 14.58f, 22.76f, 14.99f)
                curveTo(22.75f, 19.27f, 19.27f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 9.75f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9f)
                curveTo(1.25f, 4.73f, 4.73f, 1.25f, 9f, 1.25f)
                curveTo(9.27f, 1.25f, 9.52f, 1.4f, 9.65f, 1.63f)
                curveTo(9.78f, 1.87f, 9.78f, 2.15f, 9.64f, 2.39f)
                lineTo(8.59f, 4.14f)
                curveTo(8.38f, 4.49f, 7.92f, 4.61f, 7.56f, 4.4f)
                curveTo(7.2f, 4.19f, 7.09f, 3.73f, 7.3f, 3.37f)
                lineTo(7.57f, 2.92f)
                curveTo(4.81f, 3.57f, 2.74f, 6.05f, 2.74f, 9.01f)
                curveTo(2.75f, 9.41f, 2.41f, 9.75f, 2f, 9.75f)
                close()
            }
        }.build()

        return _3DRotate!!
    }

@Suppress("ObjectPropertyName")
private var _3DRotate: ImageVector? = null
