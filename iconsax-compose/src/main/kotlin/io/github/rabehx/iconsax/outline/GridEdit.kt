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

val Iconsax.Outline.GridEdit: ImageVector
    get() {
        if (_GridEdit != null) {
            return _GridEdit!!
        }
        _GridEdit = ImageVector.Builder(
            name = "Outline.GridEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(11f)
                curveTo(22.75f, 11.41f, 22.41f, 11.75f, 22f, 11.75f)
                curveTo(21.59f, 11.75f, 21.25f, 11.41f, 21.25f, 11f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 21.25f, 10.75f, 21.59f, 10.75f, 22f)
                curveTo(10.75f, 22.41f, 10.41f, 22.75f, 10f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 9.25f)
                horizontalLineTo(2.031f)
                curveTo(1.621f, 9.25f, 1.281f, 8.91f, 1.281f, 8.5f)
                curveTo(1.281f, 8.09f, 1.621f, 7.75f, 2.031f, 7.75f)
                horizontalLineTo(22.001f)
                curveTo(22.411f, 7.75f, 22.751f, 8.09f, 22.751f, 8.5f)
                curveTo(22.751f, 8.91f, 22.411f, 9.25f, 22.001f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 16.25f)
                horizontalLineTo(2.031f)
                curveTo(1.621f, 16.25f, 1.281f, 15.91f, 1.281f, 15.5f)
                curveTo(1.281f, 15.09f, 1.621f, 14.75f, 2.031f, 14.75f)
                horizontalLineTo(12.001f)
                curveTo(12.411f, 14.75f, 12.751f, 15.09f, 12.751f, 15.5f)
                curveTo(12.751f, 15.91f, 12.411f, 16.25f, 12.001f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.51f, 22.74f)
                curveTo(8.1f, 22.74f, 7.76f, 22.4f, 7.76f, 21.99f)
                verticalLineTo(2.02f)
                curveTo(7.76f, 1.61f, 8.1f, 1.27f, 8.51f, 1.27f)
                curveTo(8.92f, 1.27f, 9.26f, 1.61f, 9.26f, 2.02f)
                verticalLineTo(21.99f)
                curveTo(9.26f, 22.4f, 8.93f, 22.74f, 8.51f, 22.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.51f, 12.74f)
                curveTo(15.1f, 12.74f, 14.76f, 12.4f, 14.76f, 11.99f)
                verticalLineTo(2.02f)
                curveTo(14.76f, 1.61f, 15.1f, 1.27f, 15.51f, 1.27f)
                curveTo(15.92f, 1.27f, 16.26f, 1.61f, 16.26f, 2.02f)
                verticalLineTo(11.99f)
                curveTo(16.26f, 12.4f, 15.93f, 12.74f, 15.51f, 12.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.761f, 22.75f)
                curveTo(14.341f, 22.75f, 13.961f, 22.6f, 13.681f, 22.32f)
                curveTo(13.341f, 21.99f, 13.191f, 21.5f, 13.271f, 20.99f)
                lineTo(13.501f, 19.4f)
                curveTo(13.551f, 19.02f, 13.781f, 18.56f, 14.061f, 18.28f)
                lineTo(18.211f, 14.13f)
                curveTo(18.751f, 13.59f, 19.281f, 13.31f, 19.841f, 13.25f)
                curveTo(20.531f, 13.18f, 21.221f, 13.48f, 21.871f, 14.13f)
                curveTo(22.521f, 14.78f, 22.821f, 15.46f, 22.751f, 16.16f)
                curveTo(22.701f, 16.72f, 22.411f, 17.25f, 21.871f, 17.79f)
                lineTo(17.721f, 21.94f)
                curveTo(17.451f, 22.21f, 16.991f, 22.44f, 16.601f, 22.5f)
                lineTo(15.021f, 22.73f)
                curveTo(14.931f, 22.74f, 14.841f, 22.75f, 14.761f, 22.75f)
                close()
                moveTo(20.021f, 14.75f)
                curveTo(20.011f, 14.75f, 19.991f, 14.75f, 19.981f, 14.75f)
                curveTo(19.781f, 14.77f, 19.541f, 14.92f, 19.261f, 15.2f)
                lineTo(15.111f, 19.35f)
                curveTo(15.061f, 19.4f, 14.991f, 19.55f, 14.981f, 19.62f)
                lineTo(14.751f, 21.21f)
                lineTo(16.381f, 21.03f)
                curveTo(16.451f, 21.02f, 16.601f, 20.94f, 16.651f, 20.9f)
                lineTo(20.801f, 16.75f)
                curveTo(21.081f, 16.47f, 21.231f, 16.23f, 21.251f, 16.03f)
                curveTo(21.271f, 15.8f, 21.121f, 15.53f, 20.801f, 15.21f)
                curveTo(20.501f, 14.9f, 20.241f, 14.75f, 20.021f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.74f, 18.61f)
                curveTo(20.67f, 18.61f, 20.61f, 18.6f, 20.54f, 18.58f)
                curveTo(19.04f, 18.16f, 17.84f, 16.96f, 17.42f, 15.46f)
                curveTo(17.31f, 15.06f, 17.54f, 14.65f, 17.94f, 14.54f)
                curveTo(18.35f, 14.43f, 18.75f, 14.66f, 18.86f, 15.06f)
                curveTo(19.14f, 16.06f, 19.94f, 16.86f, 20.94f, 17.14f)
                curveTo(21.34f, 17.25f, 21.57f, 17.67f, 21.46f, 18.06f)
                curveTo(21.37f, 18.4f, 21.06f, 18.61f, 20.74f, 18.61f)
                close()
            }
        }.build()

        return _GridEdit!!
    }

@Suppress("ObjectPropertyName")
private var _GridEdit: ImageVector? = null
