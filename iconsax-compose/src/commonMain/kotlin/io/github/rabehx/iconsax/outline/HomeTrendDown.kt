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

val Iconsax.Outline.HomeTrendDown: ImageVector
    get() {
        if (_HomeTrendDown != null) {
            return _HomeTrendDown!!
        }
        _HomeTrendDown = ImageVector.Builder(
            name = "Outline.HomeTrendDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.79f, 22.74f)
                horizontalLineTo(6.21f)
                curveTo(3.47f, 22.74f, 1.25f, 20.51f, 1.25f, 17.77f)
                verticalLineTo(10.36f)
                curveTo(1.25f, 9f, 2.09f, 7.29f, 3.17f, 6.45f)
                lineTo(8.56f, 2.25f)
                curveTo(10.18f, 0.99f, 12.77f, 0.93f, 14.45f, 2.11f)
                lineTo(20.63f, 6.44f)
                curveTo(21.82f, 7.27f, 22.75f, 9.05f, 22.75f, 10.5f)
                verticalLineTo(17.78f)
                curveTo(22.75f, 20.51f, 20.53f, 22.74f, 17.79f, 22.74f)
                close()
                moveTo(9.48f, 3.43f)
                lineTo(4.09f, 7.63f)
                curveTo(3.38f, 8.19f, 2.75f, 9.46f, 2.75f, 10.36f)
                verticalLineTo(17.77f)
                curveTo(2.75f, 19.68f, 4.3f, 21.24f, 6.21f, 21.24f)
                horizontalLineTo(17.79f)
                curveTo(19.7f, 21.24f, 21.25f, 19.69f, 21.25f, 17.78f)
                verticalLineTo(10.5f)
                curveTo(21.25f, 9.54f, 20.56f, 8.21f, 19.77f, 7.67f)
                lineTo(13.59f, 3.34f)
                curveTo(12.45f, 2.54f, 10.57f, 2.58f, 9.48f, 3.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 17.25f)
                curveTo(16.31f, 17.25f, 16.12f, 17.18f, 15.97f, 17.03f)
                lineTo(12.42f, 13.48f)
                lineTo(11.33f, 15.12f)
                curveTo(11.21f, 15.31f, 11f, 15.43f, 10.78f, 15.45f)
                curveTo(10.55f, 15.47f, 10.33f, 15.39f, 10.18f, 15.23f)
                lineTo(6.98f, 12.03f)
                curveTo(6.69f, 11.74f, 6.69f, 11.26f, 6.98f, 10.97f)
                curveTo(7.27f, 10.68f, 7.75f, 10.68f, 8.04f, 10.97f)
                lineTo(10.59f, 13.52f)
                lineTo(11.68f, 11.88f)
                curveTo(11.8f, 11.69f, 12.01f, 11.57f, 12.23f, 11.55f)
                curveTo(12.46f, 11.53f, 12.68f, 11.61f, 12.83f, 11.77f)
                lineTo(17.03f, 15.97f)
                curveTo(17.32f, 16.26f, 17.32f, 16.74f, 17.03f, 17.03f)
                curveTo(16.88f, 17.18f, 16.69f, 17.25f, 16.5f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 17.25f)
                horizontalLineTo(14.5f)
                curveTo(14.09f, 17.25f, 13.75f, 16.91f, 13.75f, 16.5f)
                curveTo(13.75f, 16.09f, 14.09f, 15.75f, 14.5f, 15.75f)
                horizontalLineTo(15.75f)
                verticalLineTo(14.5f)
                curveTo(15.75f, 14.09f, 16.09f, 13.75f, 16.5f, 13.75f)
                curveTo(16.91f, 13.75f, 17.25f, 14.09f, 17.25f, 14.5f)
                verticalLineTo(16.5f)
                curveTo(17.25f, 16.91f, 16.91f, 17.25f, 16.5f, 17.25f)
                close()
            }
        }.build()

        return _HomeTrendDown!!
    }

@Suppress("ObjectPropertyName")
private var _HomeTrendDown: ImageVector? = null
