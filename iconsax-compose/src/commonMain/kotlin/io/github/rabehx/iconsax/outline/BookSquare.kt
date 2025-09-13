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

val Iconsax.Outline.BookSquare: ImageVector
    get() {
        if (_BookSquare != null) {
            return _BookSquare!!
        }
        _BookSquare = ImageVector.Builder(
            name = "Outline.BookSquare",
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
                moveTo(12f, 18.95f)
                curveTo(11.76f, 18.95f, 11.52f, 18.89f, 11.32f, 18.78f)
                curveTo(10.16f, 18.15f, 8.11f, 17.47f, 6.82f, 17.3f)
                lineTo(6.63f, 17.27f)
                curveTo(5.65f, 17.15f, 4.87f, 16.27f, 4.87f, 15.26f)
                verticalLineTo(7.56f)
                curveTo(4.87f, 6.99f, 5.11f, 6.44f, 5.52f, 6.06f)
                curveTo(5.94f, 5.68f, 6.48f, 5.49f, 7.06f, 5.54f)
                curveTo(8.52f, 5.66f, 10.64f, 6.36f, 11.89f, 7.14f)
                lineTo(11.99f, 7.2f)
                lineTo(12.03f, 7.17f)
                curveTo(13.29f, 6.38f, 15.41f, 5.67f, 16.88f, 5.54f)
                curveTo(16.9f, 5.54f, 16.96f, 5.54f, 16.98f, 5.54f)
                curveTo(17.5f, 5.49f, 18.06f, 5.69f, 18.47f, 6.06f)
                curveTo(18.89f, 6.44f, 19.12f, 6.97f, 19.12f, 7.55f)
                verticalLineTo(15.24f)
                curveTo(19.12f, 16.24f, 18.34f, 17.12f, 17.35f, 17.25f)
                lineTo(17.14f, 17.28f)
                curveTo(15.86f, 17.45f, 13.8f, 18.13f, 12.66f, 18.76f)
                curveTo(12.47f, 18.9f, 12.24f, 18.95f, 12f, 18.95f)
                close()
                moveTo(6.89f, 7.05f)
                curveTo(6.75f, 7.05f, 6.63f, 7.1f, 6.54f, 7.18f)
                curveTo(6.43f, 7.28f, 6.38f, 7.42f, 6.38f, 7.57f)
                verticalLineTo(15.27f)
                curveTo(6.38f, 15.51f, 6.6f, 15.76f, 6.83f, 15.79f)
                lineTo(7.02f, 15.82f)
                curveTo(8.48f, 16.02f, 10.72f, 16.75f, 12.02f, 17.46f)
                curveTo(13.23f, 16.76f, 15.48f, 16.01f, 16.95f, 15.82f)
                lineTo(17.17f, 15.79f)
                curveTo(17.4f, 15.76f, 17.62f, 15.51f, 17.62f, 15.27f)
                verticalLineTo(7.58f)
                curveTo(17.62f, 7.42f, 17.56f, 7.29f, 17.46f, 7.19f)
                curveTo(17.35f, 7.09f, 17.21f, 7.05f, 17.05f, 7.06f)
                curveTo(17.03f, 7.06f, 16.97f, 7.06f, 16.95f, 7.06f)
                curveTo(15.79f, 7.16f, 13.88f, 7.8f, 12.84f, 8.46f)
                lineTo(12.74f, 8.52f)
                curveTo(12.3f, 8.79f, 11.68f, 8.79f, 11.26f, 8.53f)
                lineTo(11.11f, 8.44f)
                curveTo(10.06f, 7.78f, 8.15f, 7.15f, 6.94f, 7.05f)
                curveTo(6.92f, 7.05f, 6.91f, 7.05f, 6.89f, 7.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.41f)
                curveTo(11.59f, 18.41f, 11.25f, 18.07f, 11.25f, 17.66f)
                verticalLineTo(8.1f)
                curveTo(11.25f, 7.69f, 11.59f, 7.35f, 12f, 7.35f)
                curveTo(12.41f, 7.35f, 12.75f, 7.69f, 12.75f, 8.1f)
                verticalLineTo(17.66f)
                curveTo(12.75f, 18.08f, 12.41f, 18.41f, 12f, 18.41f)
                close()
            }
        }.build()

        return _BookSquare!!
    }

@Suppress("ObjectPropertyName")
private var _BookSquare: ImageVector? = null
