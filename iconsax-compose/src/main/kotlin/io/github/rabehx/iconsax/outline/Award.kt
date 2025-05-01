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

val Iconsax.Outline.Award: ImageVector
    get() {
        if (_Award != null) {
            return _Award!!
        }
        _Award = ImageVector.Builder(
            name = "Outline.Award",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.4f, 22.75f, 10.81f, 22.61f, 10.33f, 22.34f)
                lineTo(5.6f, 19.61f)
                curveTo(3.64f, 18.29f, 3.51f, 18.05f, 3.51f, 15.98f)
                verticalLineTo(11.02f)
                curveTo(3.51f, 8.95f, 3.64f, 8.71f, 5.56f, 7.42f)
                lineTo(10.34f, 4.66f)
                curveTo(11.29f, 4.11f, 12.72f, 4.11f, 13.67f, 4.66f)
                lineTo(18.4f, 7.39f)
                curveTo(20.36f, 8.71f, 20.49f, 8.95f, 20.49f, 11.02f)
                verticalLineTo(15.98f)
                curveTo(20.49f, 18.05f, 20.36f, 18.29f, 18.44f, 19.58f)
                lineTo(13.66f, 22.34f)
                curveTo(13.19f, 22.62f, 12.59f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 5.75f)
                curveTo(11.66f, 5.75f, 11.32f, 5.82f, 11.08f, 5.96f)
                lineTo(6.35f, 8.69f)
                curveTo(5.01f, 9.6f, 5.01f, 9.6f, 5.01f, 11.02f)
                verticalLineTo(15.98f)
                curveTo(5.01f, 17.4f, 5.01f, 17.4f, 6.4f, 18.34f)
                lineTo(11.09f, 21.04f)
                curveTo(11.57f, 21.32f, 12.44f, 21.32f, 12.92f, 21.04f)
                lineTo(17.65f, 18.31f)
                curveTo(18.99f, 17.4f, 18.99f, 17.4f, 18.99f, 15.98f)
                verticalLineTo(11.02f)
                curveTo(18.99f, 9.6f, 18.99f, 9.6f, 17.6f, 8.66f)
                lineTo(12.91f, 5.96f)
                curveTo(12.68f, 5.82f, 12.34f, 5.75f, 12f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 8.38f)
                curveTo(17.09f, 8.38f, 16.75f, 8.04f, 16.75f, 7.63f)
                verticalLineTo(5f)
                curveTo(16.75f, 3.42f, 16.08f, 2.75f, 14.5f, 2.75f)
                horizontalLineTo(9.5f)
                curveTo(7.92f, 2.75f, 7.25f, 3.42f, 7.25f, 5f)
                verticalLineTo(7.56f)
                curveTo(7.25f, 7.97f, 6.91f, 8.31f, 6.5f, 8.31f)
                curveTo(6.09f, 8.31f, 5.75f, 7.98f, 5.75f, 7.56f)
                verticalLineTo(5f)
                curveTo(5.75f, 2.58f, 7.08f, 1.25f, 9.5f, 1.25f)
                horizontalLineTo(14.5f)
                curveTo(16.92f, 1.25f, 18.25f, 2.58f, 18.25f, 5f)
                verticalLineTo(7.63f)
                curveTo(18.25f, 8.04f, 17.91f, 8.38f, 17.5f, 8.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.63f, 17.63f)
                curveTo(13.42f, 17.63f, 13.2f, 17.59f, 12.98f, 17.5f)
                lineTo(12f, 17.12f)
                lineTo(11.02f, 17.51f)
                curveTo(10.49f, 17.72f, 9.95f, 17.67f, 9.55f, 17.38f)
                curveTo(9.15f, 17.09f, 8.94f, 16.59f, 8.97f, 16.02f)
                lineTo(9.03f, 14.97f)
                lineTo(8.36f, 14.16f)
                curveTo(8f, 13.71f, 7.88f, 13.19f, 8.04f, 12.71f)
                curveTo(8.19f, 12.24f, 8.6f, 11.88f, 9.15f, 11.74f)
                lineTo(10.17f, 11.48f)
                lineTo(10.74f, 10.59f)
                curveTo(11.35f, 9.63f, 12.66f, 9.63f, 13.27f, 10.59f)
                lineTo(13.84f, 11.48f)
                lineTo(14.86f, 11.74f)
                curveTo(15.41f, 11.88f, 15.82f, 12.24f, 15.97f, 12.71f)
                curveTo(16.12f, 13.18f, 16f, 13.71f, 15.64f, 14.15f)
                lineTo(14.97f, 14.96f)
                lineTo(15.03f, 16.01f)
                curveTo(15.06f, 16.58f, 14.85f, 17.07f, 14.45f, 17.37f)
                curveTo(14.21f, 17.54f, 13.93f, 17.63f, 13.63f, 17.63f)
                close()
                moveTo(9.52f, 13.2f)
                lineTo(10.19f, 14.01f)
                curveTo(10.42f, 14.28f, 10.55f, 14.71f, 10.53f, 15.06f)
                lineTo(10.47f, 16.11f)
                lineTo(11.45f, 15.72f)
                curveTo(11.78f, 15.59f, 12.22f, 15.59f, 12.55f, 15.72f)
                lineTo(13.53f, 16.11f)
                lineTo(13.47f, 15.06f)
                curveTo(13.45f, 14.71f, 13.58f, 14.29f, 13.81f, 14.01f)
                lineTo(14.48f, 13.2f)
                lineTo(13.46f, 12.94f)
                curveTo(13.12f, 12.85f, 12.76f, 12.59f, 12.57f, 12.3f)
                lineTo(12.01f, 11.42f)
                lineTo(11.44f, 12.3f)
                curveTo(11.25f, 12.6f, 10.89f, 12.86f, 10.55f, 12.95f)
                lineTo(9.52f, 13.2f)
                close()
            }
        }.build()

        return _Award!!
    }

@Suppress("ObjectPropertyName")
private var _Award: ImageVector? = null
