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

val Iconsax.Outline.Ram: ImageVector
    get() {
        if (_Ram != null) {
            return _Ram!!
        }
        _Ram = ImageVector.Builder(
            name = "Outline.Ram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 22.75f)
                horizontalLineTo(8.5f)
                curveTo(4.79f, 22.75f, 2.75f, 20.71f, 2.75f, 17f)
                verticalLineTo(7f)
                curveTo(2.75f, 3.29f, 4.79f, 1.25f, 8.5f, 1.25f)
                horizontalLineTo(15.5f)
                curveTo(19.15f, 1.25f, 21.25f, 3.35f, 21.25f, 7f)
                verticalLineTo(8f)
                curveTo(21.25f, 8.96f, 20.46f, 9.75f, 19.5f, 9.75f)
                curveTo(19.36f, 9.75f, 19.25f, 9.86f, 19.25f, 10f)
                verticalLineTo(12.17f)
                curveTo(19.25f, 12.5f, 19.38f, 12.82f, 19.62f, 13.05f)
                lineTo(20.45f, 13.88f)
                curveTo(20.97f, 14.4f, 21.26f, 15.09f, 21.26f, 15.82f)
                verticalLineTo(17f)
                curveTo(21.25f, 20.65f, 19.15f, 22.75f, 15.5f, 22.75f)
                close()
                moveTo(8.5f, 2.75f)
                curveTo(5.64f, 2.75f, 4.25f, 4.14f, 4.25f, 7f)
                verticalLineTo(17f)
                curveTo(4.25f, 19.86f, 5.64f, 21.25f, 8.5f, 21.25f)
                horizontalLineTo(15.5f)
                curveTo(18.32f, 21.25f, 19.75f, 19.82f, 19.75f, 17f)
                verticalLineTo(15.83f)
                curveTo(19.75f, 15.5f, 19.62f, 15.18f, 19.38f, 14.95f)
                lineTo(18.55f, 14.12f)
                curveTo(18.03f, 13.6f, 17.74f, 12.91f, 17.74f, 12.18f)
                verticalLineTo(10f)
                curveTo(17.74f, 9.04f, 18.53f, 8.25f, 19.49f, 8.25f)
                curveTo(19.63f, 8.25f, 19.74f, 8.14f, 19.74f, 8f)
                verticalLineTo(7f)
                curveTo(19.74f, 4.18f, 18.31f, 2.75f, 15.49f, 2.75f)
                horizontalLineTo(8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.01f, 22.72f)
                curveTo(15.601f, 22.72f, 15.26f, 22.39f, 15.26f, 21.98f)
                lineTo(15.231f, 18.99f)
                curveTo(15.231f, 18.3f, 14.66f, 17.75f, 13.981f, 17.75f)
                horizontalLineTo(9.98f)
                curveTo(9.65f, 17.75f, 9.33f, 17.88f, 9.09f, 18.12f)
                curveTo(8.86f, 18.35f, 8.73f, 18.67f, 8.73f, 19f)
                lineTo(8.74f, 21.97f)
                curveTo(8.74f, 22.38f, 8.41f, 22.72f, 7.99f, 22.72f)
                curveTo(7.58f, 22.72f, 7.24f, 22.39f, 7.24f, 21.97f)
                lineTo(7.23f, 19f)
                curveTo(7.23f, 18.26f, 7.51f, 17.57f, 8.03f, 17.05f)
                curveTo(8.55f, 16.53f, 9.24f, 16.24f, 9.98f, 16.24f)
                horizontalLineTo(13.991f)
                curveTo(15.5f, 16.24f, 16.73f, 17.47f, 16.74f, 18.97f)
                lineTo(16.771f, 21.95f)
                curveTo(16.771f, 22.38f, 16.431f, 22.72f, 16.01f, 22.72f)
                curveTo(16.021f, 22.72f, 16.01f, 22.72f, 16.01f, 22.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.97f, 8.53f)
                horizontalLineTo(7.97f)
                curveTo(7.56f, 8.53f, 7.22f, 8.19f, 7.22f, 7.78f)
                curveTo(7.22f, 7.37f, 7.56f, 7.03f, 7.97f, 7.03f)
                horizontalLineTo(13.97f)
                curveTo(14.38f, 7.03f, 14.72f, 7.37f, 14.72f, 7.78f)
                curveTo(14.72f, 8.19f, 14.39f, 8.53f, 13.97f, 8.53f)
                close()
            }
        }.build()

        return _Ram!!
    }

@Suppress("ObjectPropertyName")
private var _Ram: ImageVector? = null
