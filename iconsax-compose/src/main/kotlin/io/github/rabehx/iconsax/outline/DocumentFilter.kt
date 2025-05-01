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

val Iconsax.Outline.DocumentFilter: ImageVector
    get() {
        if (_DocumentFilter != null) {
            return _DocumentFilter!!
        }
        _DocumentFilter = ImageVector.Builder(
            name = "Outline.DocumentFilter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.08f, 16.1f)
                curveTo(6.72f, 16.1f, 6.36f, 16.01f, 6.03f, 15.82f)
                curveTo(5.36f, 15.44f, 4.96f, 14.76f, 4.96f, 14f)
                verticalLineTo(10.43f)
                curveTo(4.96f, 10.17f, 4.79f, 9.73f, 4.58f, 9.48f)
                lineTo(2.06f, 6.83f)
                curveTo(1.59f, 6.37f, 1.25f, 5.57f, 1.25f, 4.96f)
                verticalLineTo(3.41f)
                curveTo(1.25f, 2.2f, 2.17f, 1.24f, 3.35f, 1.24f)
                horizontalLineTo(12.25f)
                curveTo(13.41f, 1.24f, 14.35f, 2.18f, 14.35f, 3.34f)
                verticalLineTo(4.82f)
                curveTo(14.35f, 5.6f, 13.9f, 6.46f, 13.46f, 6.9f)
                lineTo(10.53f, 9.49f)
                curveTo(10.3f, 9.68f, 10.11f, 10.14f, 10.11f, 10.48f)
                verticalLineTo(13.38f)
                curveTo(10.11f, 14.07f, 9.69f, 14.84f, 9.14f, 15.17f)
                lineTo(8.22f, 15.77f)
                curveTo(7.86f, 15.99f, 7.47f, 16.1f, 7.08f, 16.1f)
                close()
                moveTo(3.35f, 2.75f)
                curveTo(3.01f, 2.75f, 2.75f, 3.04f, 2.75f, 3.42f)
                verticalLineTo(4.97f)
                curveTo(2.75f, 5.14f, 2.92f, 5.57f, 3.14f, 5.79f)
                lineTo(5.72f, 8.5f)
                curveTo(6.1f, 8.97f, 6.47f, 9.74f, 6.47f, 10.43f)
                verticalLineTo(14f)
                curveTo(6.47f, 14.3f, 6.66f, 14.45f, 6.78f, 14.51f)
                curveTo(6.94f, 14.6f, 7.2f, 14.65f, 7.42f, 14.51f)
                lineTo(8.35f, 13.91f)
                curveTo(8.47f, 13.84f, 8.61f, 13.56f, 8.61f, 13.39f)
                verticalLineTo(10.49f)
                curveTo(8.61f, 9.7f, 9f, 8.83f, 9.55f, 8.36f)
                lineTo(12.43f, 5.81f)
                curveTo(12.61f, 5.63f, 12.85f, 5.14f, 12.85f, 4.82f)
                verticalLineTo(3.34f)
                curveTo(12.85f, 3.01f, 12.58f, 2.74f, 12.25f, 2.74f)
                horizontalLineTo(3.35f)
                verticalLineTo(2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                curveTo(2.41f, 11.25f, 2.75f, 11.59f, 2.75f, 12f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 6.1f, 20.57f, 4.42f, 19.04f, 3.55f)
                curveTo(18.88f, 3.46f, 18.35f, 3.22f, 16.83f, 2.98f)
                curveTo(16.42f, 2.92f, 16.14f, 2.53f, 16.21f, 2.12f)
                curveTo(16.28f, 1.71f, 16.67f, 1.43f, 17.07f, 1.5f)
                curveTo(18.38f, 1.71f, 19.27f, 1.95f, 19.78f, 2.24f)
                curveTo(21.8f, 3.39f, 22.75f, 5.54f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 13.75f)
                horizontalLineTo(13f)
                curveTo(12.59f, 13.75f, 12.25f, 13.41f, 12.25f, 13f)
                curveTo(12.25f, 12.59f, 12.59f, 12.25f, 13f, 12.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 12.25f, 18.75f, 12.59f, 18.75f, 13f)
                curveTo(18.75f, 13.41f, 18.41f, 13.75f, 18f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 17.75f)
                horizontalLineTo(11f)
                curveTo(10.59f, 17.75f, 10.25f, 17.41f, 10.25f, 17f)
                curveTo(10.25f, 16.59f, 10.59f, 16.25f, 11f, 16.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 16.25f, 18.75f, 16.59f, 18.75f, 17f)
                curveTo(18.75f, 17.41f, 18.41f, 17.75f, 18f, 17.75f)
                close()
            }
        }.build()

        return _DocumentFilter!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentFilter: ImageVector? = null
