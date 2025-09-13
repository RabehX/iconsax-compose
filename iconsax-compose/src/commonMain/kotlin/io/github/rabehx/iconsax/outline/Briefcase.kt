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

val Iconsax.Outline.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) {
            return _Briefcase!!
        }
        _Briefcase = ImageVector.Builder(
            name = "Outline.Briefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(3.38f, 22.75f, 2.52f, 20.6f, 2.3f, 18.51f)
                lineTo(1.55f, 10.5f)
                curveTo(1.44f, 9.45f, 1.41f, 7.9f, 2.45f, 6.74f)
                curveTo(3.35f, 5.74f, 4.84f, 5.26f, 7f, 5.26f)
                horizontalLineTo(17f)
                curveTo(19.17f, 5.26f, 20.66f, 5.75f, 21.55f, 6.74f)
                curveTo(22.59f, 7.9f, 22.56f, 9.45f, 22.45f, 10.51f)
                lineTo(21.7f, 18.5f)
                curveTo(21.48f, 20.6f, 20.62f, 22.75f, 16f, 22.75f)
                close()
                moveTo(7f, 6.75f)
                curveTo(5.31f, 6.75f, 4.15f, 7.08f, 3.56f, 7.74f)
                curveTo(3.07f, 8.28f, 2.91f, 9.11f, 3.04f, 10.35f)
                lineTo(3.79f, 18.36f)
                curveTo(3.96f, 19.94f, 4.39f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(19.6f, 21.25f, 20.04f, 19.94f, 20.21f, 18.35f)
                lineTo(20.96f, 10.36f)
                curveTo(21.09f, 9.11f, 20.93f, 8.28f, 20.44f, 7.74f)
                curveTo(19.85f, 7.08f, 18.69f, 6.75f, 17f, 6.75f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 6.75f)
                curveTo(15.59f, 6.75f, 15.25f, 6.41f, 15.25f, 6f)
                verticalLineTo(5.2f)
                curveTo(15.25f, 3.42f, 15.25f, 2.75f, 12.8f, 2.75f)
                horizontalLineTo(11.2f)
                curveTo(8.75f, 2.75f, 8.75f, 3.42f, 8.75f, 5.2f)
                verticalLineTo(6f)
                curveTo(8.75f, 6.41f, 8.41f, 6.75f, 8f, 6.75f)
                curveTo(7.59f, 6.75f, 7.25f, 6.41f, 7.25f, 6f)
                verticalLineTo(5.2f)
                curveTo(7.25f, 3.44f, 7.25f, 1.25f, 11.2f, 1.25f)
                horizontalLineTo(12.8f)
                curveTo(16.75f, 1.25f, 16.75f, 3.44f, 16.75f, 5.2f)
                verticalLineTo(6f)
                curveTo(16.75f, 6.41f, 16.41f, 6.75f, 16f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.75f)
                curveTo(9.25f, 16.75f, 9.25f, 15.05f, 9.25f, 14.03f)
                verticalLineTo(13f)
                curveTo(9.25f, 11.59f, 9.59f, 11.25f, 11f, 11.25f)
                horizontalLineTo(13f)
                curveTo(14.41f, 11.25f, 14.75f, 11.59f, 14.75f, 13f)
                verticalLineTo(14f)
                curveTo(14.75f, 15.04f, 14.75f, 16.75f, 12f, 16.75f)
                close()
                moveTo(10.75f, 12.75f)
                curveTo(10.75f, 12.83f, 10.75f, 12.92f, 10.75f, 13f)
                verticalLineTo(14.03f)
                curveTo(10.75f, 15.06f, 10.75f, 15.25f, 12f, 15.25f)
                curveTo(13.25f, 15.25f, 13.25f, 15.09f, 13.25f, 14.02f)
                verticalLineTo(13f)
                curveTo(13.25f, 12.92f, 13.25f, 12.83f, 13.25f, 12.75f)
                curveTo(13.17f, 12.75f, 13.08f, 12.75f, 13f, 12.75f)
                horizontalLineTo(11f)
                curveTo(10.92f, 12.75f, 10.83f, 12.75f, 10.75f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 14.77f)
                curveTo(13.63f, 14.77f, 13.3f, 14.49f, 13.259f, 14.11f)
                curveTo(13.21f, 13.7f, 13.5f, 13.32f, 13.91f, 13.27f)
                curveTo(16.549f, 12.94f, 19.08f, 11.94f, 21.209f, 10.39f)
                curveTo(21.539f, 10.14f, 22.01f, 10.22f, 22.26f, 10.56f)
                curveTo(22.5f, 10.89f, 22.43f, 11.36f, 22.09f, 11.61f)
                curveTo(19.75f, 13.31f, 16.99f, 14.4f, 14.09f, 14.77f)
                curveTo(14.059f, 14.77f, 14.03f, 14.77f, 14f, 14.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.001f, 14.78f)
                curveTo(9.971f, 14.78f, 9.941f, 14.78f, 9.911f, 14.78f)
                curveTo(7.171f, 14.47f, 4.501f, 13.47f, 2.191f, 11.89f)
                curveTo(1.851f, 11.66f, 1.761f, 11.19f, 1.991f, 10.85f)
                curveTo(2.221f, 10.51f, 2.691f, 10.42f, 3.031f, 10.65f)
                curveTo(5.141f, 12.09f, 7.571f, 13f, 10.071f, 13.29f)
                curveTo(10.481f, 13.34f, 10.781f, 13.71f, 10.731f, 14.12f)
                curveTo(10.701f, 14.5f, 10.381f, 14.78f, 10.001f, 14.78f)
                close()
            }
        }.build()

        return _Briefcase!!
    }

@Suppress("ObjectPropertyName")
private var _Briefcase: ImageVector? = null
