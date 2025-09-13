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

val Iconsax.Outline.ColorsSquare: ImageVector
    get() {
        if (_ColorsSquare != null) {
            return _ColorsSquare!!
        }
        _ColorsSquare = ImageVector.Builder(
            name = "Outline.ColorsSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.6f, 18.75f)
                curveTo(7.2f, 18.75f, 5.25f, 16.8f, 5.25f, 14.4f)
                curveTo(5.25f, 12.44f, 6.57f, 10.71f, 8.46f, 10.2f)
                curveTo(8.83f, 10.1f, 9.21f, 10.29f, 9.35f, 10.65f)
                curveTo(9.68f, 11.48f, 10.39f, 12.12f, 11.25f, 12.35f)
                curveTo(11.72f, 12.48f, 12.28f, 12.48f, 12.75f, 12.35f)
                curveTo(13.12f, 12.25f, 13.51f, 12.44f, 13.65f, 12.79f)
                curveTo(13.85f, 13.3f, 13.95f, 13.84f, 13.95f, 14.39f)
                curveTo(13.95f, 15.63f, 13.42f, 16.81f, 12.5f, 17.63f)
                curveTo(11.71f, 18.35f, 10.68f, 18.75f, 9.6f, 18.75f)
                close()
                moveTo(8.29f, 11.87f)
                curveTo(7.36f, 12.35f, 6.75f, 13.32f, 6.75f, 14.4f)
                curveTo(6.75f, 15.97f, 8.03f, 17.25f, 9.6f, 17.25f)
                curveTo(10.3f, 17.25f, 10.98f, 16.99f, 11.5f, 16.52f)
                curveTo(12.11f, 15.98f, 12.45f, 15.21f, 12.45f, 14.4f)
                curveTo(12.45f, 14.24f, 12.44f, 14.09f, 12.41f, 13.93f)
                curveTo(11.88f, 13.98f, 11.34f, 13.93f, 10.85f, 13.79f)
                curveTo(9.78f, 13.5f, 8.86f, 12.8f, 8.29f, 11.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.95f)
                curveTo(11.6f, 13.95f, 11.21f, 13.9f, 10.85f, 13.8f)
                curveTo(9.54f, 13.44f, 8.46f, 12.47f, 7.96f, 11.21f)
                curveTo(7.76f, 10.7f, 7.66f, 10.16f, 7.66f, 9.61f)
                curveTo(7.66f, 7.21f, 9.61f, 5.26f, 12.01f, 5.26f)
                curveTo(14.41f, 5.26f, 16.36f, 7.21f, 16.36f, 9.61f)
                curveTo(16.36f, 10.16f, 16.26f, 10.7f, 16.06f, 11.21f)
                curveTo(15.56f, 12.48f, 14.47f, 13.45f, 13.16f, 13.8f)
                curveTo(12.79f, 13.9f, 12.4f, 13.95f, 12f, 13.95f)
                close()
                moveTo(12f, 6.75f)
                curveTo(10.43f, 6.75f, 9.15f, 8.03f, 9.15f, 9.6f)
                curveTo(9.15f, 9.96f, 9.22f, 10.32f, 9.35f, 10.65f)
                curveTo(9.68f, 11.48f, 10.39f, 12.12f, 11.25f, 12.35f)
                curveTo(11.72f, 12.48f, 12.28f, 12.48f, 12.75f, 12.35f)
                curveTo(13.62f, 12.11f, 14.33f, 11.48f, 14.65f, 10.65f)
                curveTo(14.78f, 10.32f, 14.85f, 9.96f, 14.85f, 9.6f)
                curveTo(14.85f, 8.03f, 13.57f, 6.75f, 12f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.4f, 18.75f)
                curveTo(13.32f, 18.75f, 12.29f, 18.35f, 11.5f, 17.63f)
                curveTo(11.34f, 17.49f, 11.25f, 17.28f, 11.25f, 17.07f)
                curveTo(11.25f, 16.86f, 11.34f, 16.65f, 11.5f, 16.51f)
                curveTo(12.1f, 15.98f, 12.45f, 15.21f, 12.45f, 14.4f)
                curveTo(12.45f, 14.04f, 12.38f, 13.68f, 12.25f, 13.35f)
                curveTo(12.17f, 13.15f, 12.18f, 12.93f, 12.28f, 12.74f)
                curveTo(12.37f, 12.55f, 12.55f, 12.41f, 12.75f, 12.35f)
                curveTo(13.61f, 12.11f, 14.32f, 11.48f, 14.65f, 10.65f)
                curveTo(14.79f, 10.3f, 15.17f, 10.1f, 15.54f, 10.2f)
                curveTo(17.43f, 10.71f, 18.75f, 12.44f, 18.75f, 14.4f)
                curveTo(18.75f, 16.8f, 16.8f, 18.75f, 14.4f, 18.75f)
                close()
                moveTo(13.12f, 16.95f)
                curveTo(13.51f, 17.15f, 13.95f, 17.25f, 14.4f, 17.25f)
                curveTo(15.97f, 17.25f, 17.25f, 15.97f, 17.25f, 14.4f)
                curveTo(17.25f, 13.32f, 16.64f, 12.35f, 15.71f, 11.87f)
                curveTo(15.27f, 12.59f, 14.62f, 13.17f, 13.86f, 13.53f)
                curveTo(13.92f, 13.81f, 13.95f, 14.1f, 13.95f, 14.4f)
                curveTo(13.95f, 15.32f, 13.66f, 16.21f, 13.12f, 16.95f)
                close()
            }
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
        }.build()

        return _ColorsSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ColorsSquare: ImageVector? = null
