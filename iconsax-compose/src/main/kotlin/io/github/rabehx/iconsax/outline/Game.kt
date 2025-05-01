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

val Iconsax.Outline.Game: ImageVector
    get() {
        if (_Game != null) {
            return _Game!!
        }
        _Game = ImageVector.Builder(
            name = "Outline.Game",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.52f, 16.26f)
                curveTo(6.33f, 16.26f, 6.14f, 16.19f, 5.99f, 16.04f)
                curveTo(5.7f, 15.75f, 5.7f, 15.27f, 5.99f, 14.98f)
                lineTo(9.04f, 11.93f)
                curveTo(9.33f, 11.64f, 9.81f, 11.64f, 10.1f, 11.93f)
                curveTo(10.39f, 12.22f, 10.39f, 12.7f, 10.1f, 12.99f)
                lineTo(7.05f, 16.04f)
                curveTo(6.9f, 16.18f, 6.71f, 16.26f, 6.52f, 16.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.6f, 16.29f)
                curveTo(9.41f, 16.29f, 9.22f, 16.22f, 9.07f, 16.07f)
                lineTo(6.02f, 13.02f)
                curveTo(5.73f, 12.73f, 5.73f, 12.25f, 6.02f, 11.96f)
                curveTo(6.31f, 11.67f, 6.79f, 11.67f, 7.08f, 11.96f)
                lineTo(10.13f, 15.01f)
                curveTo(10.42f, 15.3f, 10.42f, 15.78f, 10.13f, 16.07f)
                curveTo(9.98f, 16.22f, 9.79f, 16.29f, 9.6f, 16.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.54f, 15f)
                curveTo(12.99f, 15f, 12.53f, 14.55f, 12.53f, 14f)
                curveTo(12.53f, 13.45f, 12.97f, 13f, 13.52f, 13f)
                horizontalLineTo(13.54f)
                curveTo(14.09f, 13f, 14.54f, 13.45f, 14.54f, 14f)
                curveTo(14.54f, 14.55f, 14.1f, 15f, 13.54f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.48f, 15f)
                curveTo(16.93f, 15f, 16.47f, 14.55f, 16.47f, 14f)
                curveTo(16.47f, 13.45f, 16.91f, 13f, 17.46f, 13f)
                horizontalLineTo(17.48f)
                curveTo(18.03f, 13f, 18.48f, 13.45f, 18.48f, 14f)
                curveTo(18.48f, 14.55f, 18.03f, 15f, 17.48f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 16.97f)
                curveTo(14.95f, 16.97f, 14.5f, 16.53f, 14.5f, 15.98f)
                verticalLineTo(15.96f)
                curveTo(14.5f, 15.41f, 14.95f, 14.96f, 15.5f, 14.96f)
                curveTo(16.05f, 14.96f, 16.5f, 15.41f, 16.5f, 15.96f)
                curveTo(16.5f, 16.51f, 16.06f, 16.97f, 15.5f, 16.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 13.03f)
                curveTo(14.95f, 13.03f, 14.5f, 12.59f, 14.5f, 12.04f)
                verticalLineTo(12.02f)
                curveTo(14.5f, 11.47f, 14.95f, 11.02f, 15.5f, 11.02f)
                curveTo(16.05f, 11.02f, 16.5f, 11.47f, 16.5f, 12.02f)
                curveTo(16.5f, 12.57f, 16.06f, 13.03f, 15.5f, 13.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(13f)
                curveTo(1.25f, 7.57f, 3.57f, 5.25f, 9f, 5.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 5.25f, 22.75f, 7.57f, 22.75f, 13f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 6.75f)
                curveTo(4.39f, 6.75f, 2.75f, 8.39f, 2.75f, 13f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(13f)
                curveTo(21.25f, 8.39f, 19.61f, 6.75f, 15f, 6.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.99f, 6.75f)
                horizontalLineTo(11.99f)
                curveTo(11.03f, 6.75f, 10.24f, 5.96f, 10.24f, 5f)
                curveTo(10.24f, 4.04f, 11.02f, 3.25f, 11.98f, 3.25f)
                curveTo(12.14f, 3.25f, 12.25f, 3.14f, 12.26f, 3f)
                lineTo(12.27f, 1.99f)
                curveTo(12.28f, 1.58f, 12.61f, 1.25f, 13.02f, 1.25f)
                horizontalLineTo(13.03f)
                curveTo(13.44f, 1.26f, 13.78f, 1.6f, 13.77f, 2.01f)
                lineTo(13.76f, 3.02f)
                curveTo(13.75f, 3.97f, 12.96f, 4.75f, 12.01f, 4.75f)
                curveTo(11.85f, 4.75f, 11.75f, 4.86f, 11.75f, 5f)
                curveTo(11.75f, 5.14f, 11.86f, 5.25f, 12f, 5.25f)
                horizontalLineTo(13f)
                curveTo(13.41f, 5.25f, 13.75f, 5.59f, 13.75f, 6f)
                curveTo(13.75f, 6.41f, 13.4f, 6.75f, 12.99f, 6.75f)
                close()
            }
        }.build()

        return _Game!!
    }

@Suppress("ObjectPropertyName")
private var _Game: ImageVector? = null
