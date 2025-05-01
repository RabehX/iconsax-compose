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

val Iconsax.Outline.TruckTick: ImageVector
    get() {
        if (_TruckTick != null) {
            return _TruckTick!!
        }
        _TruckTick = ImageVector.Builder(
            name = "Outline.TruckTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 14.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 14.75f, 1.25f, 14.41f, 1.25f, 14f)
                verticalLineTo(7.62f)
                curveTo(1.25f, 7.3f, 1.45f, 7.02f, 1.74f, 6.91f)
                curveTo(2.04f, 6.8f, 2.37f, 6.89f, 2.57f, 7.13f)
                curveTo(3.18f, 7.86f, 4.13f, 8.27f, 5.07f, 8.24f)
                curveTo(5.87f, 8.22f, 6.61f, 7.92f, 7.17f, 7.39f)
                curveTo(7.43f, 7.17f, 7.64f, 6.91f, 7.8f, 6.62f)
                curveTo(8.11f, 6.09f, 8.26f, 5.51f, 8.25f, 4.92f)
                curveTo(8.23f, 4f, 7.83f, 3.16f, 7.15f, 2.55f)
                curveTo(6.91f, 2.34f, 6.83f, 2.01f, 6.94f, 1.72f)
                curveTo(7.05f, 1.43f, 7.33f, 1.23f, 7.64f, 1.23f)
                horizontalLineTo(15f)
                curveTo(15.41f, 1.23f, 15.75f, 1.57f, 15.75f, 1.98f)
                verticalLineTo(11.98f)
                curveTo(15.75f, 13.52f, 14.52f, 14.75f, 13f, 14.75f)
                close()
                moveTo(2.75f, 13.25f)
                horizontalLineTo(13f)
                curveTo(13.69f, 13.25f, 14.25f, 12.69f, 14.25f, 12f)
                verticalLineTo(2.75f)
                horizontalLineTo(9.19f)
                curveTo(9.54f, 3.4f, 9.73f, 4.13f, 9.75f, 4.89f)
                curveTo(9.77f, 5.76f, 9.55f, 6.62f, 9.11f, 7.37f)
                curveTo(8.87f, 7.8f, 8.54f, 8.21f, 8.18f, 8.51f)
                curveTo(7.38f, 9.27f, 6.28f, 9.72f, 5.11f, 9.75f)
                curveTo(4.27f, 9.78f, 3.46f, 9.57f, 2.76f, 9.19f)
                verticalLineTo(13.25f)
                horizontalLineTo(2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 20.75f)
                horizontalLineTo(18f)
                curveTo(17.59f, 20.75f, 17.25f, 20.41f, 17.25f, 20f)
                curveTo(17.25f, 19.31f, 16.69f, 18.75f, 16f, 18.75f)
                curveTo(15.31f, 18.75f, 14.75f, 19.31f, 14.75f, 20f)
                curveTo(14.75f, 20.41f, 14.41f, 20.75f, 14f, 20.75f)
                horizontalLineTo(10f)
                curveTo(9.59f, 20.75f, 9.25f, 20.41f, 9.25f, 20f)
                curveTo(9.25f, 19.31f, 8.69f, 18.75f, 8f, 18.75f)
                curveTo(7.31f, 18.75f, 6.75f, 19.31f, 6.75f, 20f)
                curveTo(6.75f, 20.41f, 6.41f, 20.75f, 6f, 20.75f)
                horizontalLineTo(5f)
                curveTo(2.93f, 20.75f, 1.25f, 19.07f, 1.25f, 17f)
                verticalLineTo(14f)
                curveTo(1.25f, 13.59f, 1.59f, 13.25f, 2f, 13.25f)
                horizontalLineTo(13f)
                curveTo(13.69f, 13.25f, 14.25f, 12.69f, 14.25f, 12f)
                verticalLineTo(5f)
                curveTo(14.25f, 4.59f, 14.59f, 4.25f, 15f, 4.25f)
                horizontalLineTo(16.84f)
                curveTo(17.83f, 4.25f, 18.74f, 4.78f, 19.23f, 5.64f)
                lineTo(20.94f, 8.63f)
                curveTo(21.07f, 8.86f, 21.07f, 9.15f, 20.94f, 9.38f)
                curveTo(20.81f, 9.61f, 20.56f, 9.75f, 20.29f, 9.75f)
                horizontalLineTo(19f)
                curveTo(18.86f, 9.75f, 18.75f, 9.86f, 18.75f, 10f)
                verticalLineTo(13f)
                curveTo(18.75f, 13.14f, 18.86f, 13.25f, 19f, 13.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 13.25f, 22.75f, 13.59f, 22.75f, 14f)
                verticalLineTo(17f)
                curveTo(22.75f, 19.07f, 21.07f, 20.75f, 19f, 20.75f)
                close()
                moveTo(18.65f, 19.25f)
                horizontalLineTo(19f)
                curveTo(20.24f, 19.25f, 21.25f, 18.24f, 21.25f, 17f)
                verticalLineTo(14.75f)
                horizontalLineTo(19f)
                curveTo(18.04f, 14.75f, 17.25f, 13.96f, 17.25f, 13f)
                verticalLineTo(10f)
                curveTo(17.25f, 9.04f, 18.03f, 8.25f, 19f, 8.25f)
                lineTo(17.93f, 6.38f)
                curveTo(17.71f, 5.99f, 17.29f, 5.75f, 16.84f, 5.75f)
                horizontalLineTo(15.75f)
                verticalLineTo(12f)
                curveTo(15.75f, 13.52f, 14.52f, 14.75f, 13f, 14.75f)
                horizontalLineTo(2.75f)
                verticalLineTo(17f)
                curveTo(2.75f, 18.24f, 3.76f, 19.25f, 5f, 19.25f)
                horizontalLineTo(5.35f)
                curveTo(5.68f, 18.1f, 6.74f, 17.25f, 8f, 17.25f)
                curveTo(9.26f, 17.25f, 10.32f, 18.1f, 10.65f, 19.25f)
                horizontalLineTo(13.36f)
                curveTo(13.69f, 18.1f, 14.75f, 17.25f, 16.01f, 17.25f)
                curveTo(17.27f, 17.25f, 18.32f, 18.1f, 18.65f, 19.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 22.75f)
                curveTo(6.48f, 22.75f, 5.25f, 21.52f, 5.25f, 20f)
                curveTo(5.25f, 18.48f, 6.48f, 17.25f, 8f, 17.25f)
                curveTo(9.52f, 17.25f, 10.75f, 18.48f, 10.75f, 20f)
                curveTo(10.75f, 21.52f, 9.52f, 22.75f, 8f, 22.75f)
                close()
                moveTo(8f, 18.75f)
                curveTo(7.31f, 18.75f, 6.75f, 19.31f, 6.75f, 20f)
                curveTo(6.75f, 20.69f, 7.31f, 21.25f, 8f, 21.25f)
                curveTo(8.69f, 21.25f, 9.25f, 20.69f, 9.25f, 20f)
                curveTo(9.25f, 19.31f, 8.69f, 18.75f, 8f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                curveTo(14.48f, 22.75f, 13.25f, 21.52f, 13.25f, 20f)
                curveTo(13.25f, 18.48f, 14.48f, 17.25f, 16f, 17.25f)
                curveTo(17.52f, 17.25f, 18.75f, 18.48f, 18.75f, 20f)
                curveTo(18.75f, 21.52f, 17.52f, 22.75f, 16f, 22.75f)
                close()
                moveTo(16f, 18.75f)
                curveTo(15.31f, 18.75f, 14.75f, 19.31f, 14.75f, 20f)
                curveTo(14.75f, 20.69f, 15.31f, 21.25f, 16f, 21.25f)
                curveTo(16.69f, 21.25f, 17.25f, 20.69f, 17.25f, 20f)
                curveTo(17.25f, 19.31f, 16.69f, 18.75f, 16f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 14.75f)
                horizontalLineTo(19f)
                curveTo(18.04f, 14.75f, 17.25f, 13.96f, 17.25f, 13f)
                verticalLineTo(10f)
                curveTo(17.25f, 9.04f, 18.04f, 8.25f, 19f, 8.25f)
                horizontalLineTo(20.29f)
                curveTo(20.56f, 8.25f, 20.81f, 8.39f, 20.94f, 8.63f)
                lineTo(22.65f, 11.63f)
                curveTo(22.71f, 11.74f, 22.75f, 11.87f, 22.75f, 12f)
                verticalLineTo(14f)
                curveTo(22.75f, 14.41f, 22.41f, 14.75f, 22f, 14.75f)
                close()
                moveTo(19f, 9.75f)
                curveTo(18.86f, 9.75f, 18.75f, 9.86f, 18.75f, 10f)
                verticalLineTo(13f)
                curveTo(18.75f, 13.14f, 18.86f, 13.25f, 19f, 13.25f)
                horizontalLineTo(21.25f)
                verticalLineTo(12.2f)
                lineTo(19.85f, 9.75f)
                horizontalLineTo(19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.99f, 9.75f)
                curveTo(3.61f, 9.75f, 2.31f, 9.15f, 1.43f, 8.1f)
                curveTo(1.29f, 7.95f, 1.14f, 7.74f, 1.01f, 7.54f)
                curveTo(0.54f, 6.83f, 0.28f, 5.99f, 0.26f, 5.11f)
                curveTo(0.22f, 3.65f, 0.84f, 2.28f, 1.96f, 1.35f)
                curveTo(2.81f, 0.65f, 3.83f, 0.27f, 4.91f, 0.25f)
                curveTo(6.09f, 0.26f, 7.27f, 0.65f, 8.15f, 1.44f)
                curveTo(9.15f, 2.32f, 9.73f, 3.55f, 9.76f, 4.89f)
                curveTo(9.78f, 5.76f, 9.56f, 6.62f, 9.12f, 7.37f)
                curveTo(8.88f, 7.8f, 8.55f, 8.21f, 8.19f, 8.51f)
                curveTo(7.39f, 9.27f, 6.29f, 9.72f, 5.12f, 9.75f)
                curveTo(5.07f, 9.75f, 5.03f, 9.75f, 4.99f, 9.75f)
                close()
                moveTo(4.99f, 1.75f)
                curveTo(4.97f, 1.75f, 4.95f, 1.75f, 4.93f, 1.75f)
                curveTo(4.2f, 1.76f, 3.5f, 2.03f, 2.91f, 2.51f)
                curveTo(2.15f, 3.14f, 1.73f, 4.08f, 1.75f, 5.07f)
                curveTo(1.77f, 5.67f, 1.94f, 6.24f, 2.26f, 6.71f)
                curveTo(2.35f, 6.85f, 2.44f, 6.98f, 2.55f, 7.1f)
                curveTo(3.19f, 7.86f, 4.14f, 8.26f, 5.07f, 8.24f)
                curveTo(5.87f, 8.22f, 6.61f, 7.92f, 7.17f, 7.39f)
                curveTo(7.43f, 7.17f, 7.64f, 6.91f, 7.8f, 6.62f)
                curveTo(8.11f, 6.09f, 8.26f, 5.51f, 8.25f, 4.92f)
                curveTo(8.23f, 4f, 7.83f, 3.16f, 7.15f, 2.55f)
                curveTo(6.55f, 2.04f, 5.79f, 1.75f, 4.99f, 1.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.449f, 6.75f)
                curveTo(4.259f, 6.75f, 4.079f, 6.68f, 3.929f, 6.54f)
                lineTo(2.919f, 5.58f)
                curveTo(2.619f, 5.29f, 2.609f, 4.82f, 2.899f, 4.52f)
                curveTo(3.189f, 4.22f, 3.659f, 4.21f, 3.959f, 4.5f)
                lineTo(4.449f, 4.97f)
                lineTo(6.019f, 3.45f)
                curveTo(6.319f, 3.16f, 6.789f, 3.17f, 7.079f, 3.47f)
                curveTo(7.369f, 3.77f, 7.359f, 4.24f, 7.059f, 4.53f)
                lineTo(4.969f, 6.55f)
                curveTo(4.819f, 6.68f, 4.629f, 6.75f, 4.449f, 6.75f)
                close()
            }
        }.build()

        return _TruckTick!!
    }

@Suppress("ObjectPropertyName")
private var _TruckTick: ImageVector? = null
