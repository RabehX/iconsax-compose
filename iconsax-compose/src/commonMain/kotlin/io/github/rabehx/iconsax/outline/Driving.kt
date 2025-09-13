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

val Iconsax.Outline.Driving: ImageVector
    get() {
        if (_Driving != null) {
            return _Driving!!
        }
        _Driving = ImageVector.Builder(
            name = "Outline.Driving",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.801f, 8.68f)
                horizontalLineTo(6.201f)
                curveTo(5.971f, 8.68f, 5.761f, 8.58f, 5.621f, 8.4f)
                curveTo(5.481f, 8.22f, 5.421f, 7.99f, 5.471f, 7.77f)
                lineTo(6.291f, 3.85f)
                curveTo(6.561f, 2.56f, 7.151f, 1.25f, 9.451f, 1.25f)
                horizontalLineTo(14.55f)
                curveTo(16.861f, 1.25f, 17.451f, 2.57f, 17.711f, 3.85f)
                lineTo(18.531f, 7.77f)
                curveTo(18.58f, 7.99f, 18.521f, 8.22f, 18.381f, 8.4f)
                curveTo(18.24f, 8.58f, 18.031f, 8.68f, 17.801f, 8.68f)
                close()
                moveTo(7.121f, 7.18f)
                horizontalLineTo(16.871f)
                lineTo(16.24f, 4.17f)
                curveTo(16.041f, 3.21f, 15.811f, 2.76f, 14.54f, 2.76f)
                horizontalLineTo(9.441f)
                curveTo(8.181f, 2.76f, 7.941f, 3.21f, 7.741f, 4.17f)
                lineTo(7.121f, 7.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.77f, 16.65f)
                horizontalLineTo(16.41f)
                curveTo(15.09f, 16.65f, 14.82f, 15.83f, 14.67f, 15.39f)
                lineTo(14.52f, 14.95f)
                curveTo(14.36f, 14.47f, 14.36f, 14.47f, 13.85f, 14.47f)
                horizontalLineTo(10.14f)
                curveTo(9.63f, 14.47f, 9.63f, 14.48f, 9.47f, 14.95f)
                lineTo(9.32f, 15.39f)
                curveTo(9.17f, 15.83f, 8.9f, 16.65f, 7.58f, 16.65f)
                horizontalLineTo(6.22f)
                curveTo(5.59f, 16.65f, 4.98f, 16.38f, 4.56f, 15.92f)
                curveTo(4.15f, 15.47f, 3.94f, 14.86f, 4f, 14.25f)
                lineTo(4.41f, 9.84f)
                curveTo(4.54f, 8.46f, 4.99f, 7.18f, 7.37f, 7.18f)
                horizontalLineTo(16.62f)
                curveTo(19f, 7.18f, 19.45f, 8.46f, 19.58f, 9.84f)
                lineTo(19.99f, 14.26f)
                curveTo(20.05f, 14.87f, 19.84f, 15.48f, 19.43f, 15.93f)
                curveTo(19.01f, 16.39f, 18.4f, 16.65f, 17.77f, 16.65f)
                close()
                moveTo(16.18f, 15.14f)
                curveTo(16.2f, 15.14f, 16.28f, 15.15f, 16.41f, 15.15f)
                horizontalLineTo(17.77f)
                curveTo(17.98f, 15.15f, 18.18f, 15.07f, 18.32f, 14.91f)
                curveTo(18.45f, 14.77f, 18.51f, 14.58f, 18.5f, 14.39f)
                lineTo(18.09f, 9.97f)
                curveTo(18.01f, 9.08f, 17.97f, 8.67f, 16.63f, 8.67f)
                horizontalLineTo(7.38f)
                curveTo(6.04f, 8.67f, 6f, 9.08f, 5.92f, 9.97f)
                lineTo(5.51f, 14.39f)
                curveTo(5.49f, 14.58f, 5.55f, 14.77f, 5.69f, 14.91f)
                curveTo(5.83f, 15.06f, 6.03f, 15.15f, 6.24f, 15.15f)
                horizontalLineTo(7.6f)
                curveTo(7.8f, 15.15f, 7.86f, 15.12f, 7.87f, 15.12f)
                curveTo(7.86f, 15.12f, 7.89f, 15f, 7.92f, 14.92f)
                lineTo(8.07f, 14.48f)
                curveTo(8.26f, 13.92f, 8.57f, 12.97f, 10.16f, 12.97f)
                horizontalLineTo(13.87f)
                curveTo(15.32f, 12.97f, 15.69f, 13.68f, 15.95f, 14.46f)
                lineTo(16.1f, 14.91f)
                curveTo(16.12f, 15f, 16.15f, 15.1f, 16.18f, 15.14f)
                curveTo(16.17f, 15.14f, 16.18f, 15.14f, 16.18f, 15.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.201f, 6.5f)
                horizontalLineTo(5.471f)
                curveTo(5.061f, 6.5f, 4.721f, 6.16f, 4.721f, 5.75f)
                curveTo(4.721f, 5.34f, 5.061f, 5f, 5.471f, 5f)
                horizontalLineTo(6.201f)
                curveTo(6.611f, 5f, 6.951f, 5.34f, 6.951f, 5.75f)
                curveTo(6.951f, 6.16f, 6.611f, 6.5f, 6.201f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.531f, 6.5f)
                horizontalLineTo(17.801f)
                curveTo(17.391f, 6.5f, 17.051f, 6.16f, 17.051f, 5.75f)
                curveTo(17.051f, 5.34f, 17.391f, 5f, 17.801f, 5f)
                horizontalLineTo(18.531f)
                curveTo(18.941f, 5f, 19.281f, 5.34f, 19.281f, 5.75f)
                curveTo(19.281f, 6.16f, 18.941f, 6.5f, 18.531f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.821f, 11.58f)
                horizontalLineTo(7.641f)
                curveTo(7.231f, 11.58f, 6.891f, 11.24f, 6.891f, 10.83f)
                curveTo(6.891f, 10.42f, 7.231f, 10.08f, 7.641f, 10.08f)
                horizontalLineTo(9.821f)
                curveTo(10.231f, 10.08f, 10.571f, 10.42f, 10.571f, 10.83f)
                curveTo(10.571f, 11.24f, 10.241f, 11.58f, 9.821f, 11.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.35f, 11.58f)
                horizontalLineTo(14.17f)
                curveTo(13.76f, 11.58f, 13.42f, 11.24f, 13.42f, 10.83f)
                curveTo(13.42f, 10.42f, 13.76f, 10.08f, 14.17f, 10.08f)
                horizontalLineTo(16.35f)
                curveTo(16.76f, 10.08f, 17.1f, 10.42f, 17.1f, 10.83f)
                curveTo(17.1f, 11.24f, 16.76f, 11.58f, 16.35f, 11.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18f)
                verticalLineTo(17f)
                curveTo(11.25f, 16.59f, 11.59f, 16.25f, 12f, 16.25f)
                curveTo(12.41f, 16.25f, 12.75f, 16.59f, 12.75f, 17f)
                verticalLineTo(18f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(21f)
                curveTo(11.25f, 20.59f, 11.59f, 20.25f, 12f, 20.25f)
                curveTo(12.41f, 20.25f, 12.75f, 20.59f, 12.75f, 21f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 22.75f)
                curveTo(1.94f, 22.75f, 1.88f, 22.74f, 1.82f, 22.73f)
                curveTo(1.42f, 22.63f, 1.17f, 22.22f, 1.27f, 21.82f)
                lineTo(2.27f, 17.82f)
                curveTo(2.37f, 17.42f, 2.77f, 17.17f, 3.18f, 17.27f)
                curveTo(3.58f, 17.37f, 3.83f, 17.78f, 3.73f, 18.18f)
                lineTo(2.73f, 22.18f)
                curveTo(2.64f, 22.52f, 2.34f, 22.75f, 2f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 22.75f)
                curveTo(21.661f, 22.75f, 21.361f, 22.52f, 21.271f, 22.18f)
                lineTo(20.271f, 18.18f)
                curveTo(20.171f, 17.78f, 20.411f, 17.37f, 20.821f, 17.27f)
                curveTo(21.221f, 17.17f, 21.631f, 17.41f, 21.731f, 17.82f)
                lineTo(22.731f, 21.82f)
                curveTo(22.831f, 22.22f, 22.591f, 22.63f, 22.181f, 22.73f)
                curveTo(22.121f, 22.74f, 22.061f, 22.75f, 22.001f, 22.75f)
                close()
            }
        }.build()

        return _Driving!!
    }

@Suppress("ObjectPropertyName")
private var _Driving: ImageVector? = null
