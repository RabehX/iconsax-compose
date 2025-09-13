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

val Iconsax.Outline.PathSquare: ImageVector
    get() {
        if (_PathSquare != null) {
            return _PathSquare!!
        }
        _PathSquare = ImageVector.Builder(
            name = "Outline.PathSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.039f, 13.02f)
                curveTo(14.849f, 13.02f, 14.649f, 12.94f, 14.509f, 12.8f)
                lineTo(11.219f, 9.51f)
                curveTo(10.969f, 9.26f, 10.929f, 8.88f, 11.119f, 8.58f)
                lineTo(12.149f, 6.95f)
                curveTo(12.479f, 6.42f, 12.999f, 6.09f, 13.589f, 6.03f)
                curveTo(14.239f, 5.96f, 14.919f, 6.22f, 15.439f, 6.74f)
                lineTo(17.289f, 8.59f)
                curveTo(17.789f, 9.09f, 18.039f, 9.77f, 17.969f, 10.44f)
                curveTo(17.899f, 11.04f, 17.579f, 11.56f, 17.079f, 11.88f)
                lineTo(15.449f, 12.91f)
                curveTo(15.309f, 12.99f, 15.169f, 13.02f, 15.039f, 13.02f)
                close()
                moveTo(12.699f, 8.87f)
                lineTo(15.149f, 11.32f)
                lineTo(16.269f, 10.61f)
                curveTo(16.409f, 10.52f, 16.459f, 10.38f, 16.469f, 10.27f)
                curveTo(16.489f, 10.06f, 16.399f, 9.82f, 16.219f, 9.64f)
                lineTo(14.369f, 7.8f)
                curveTo(14.169f, 7.6f, 13.939f, 7.5f, 13.749f, 7.52f)
                curveTo(13.609f, 7.54f, 13.499f, 7.61f, 13.409f, 7.75f)
                lineTo(12.699f, 8.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.29f, 17.98f)
                curveTo(7.67f, 17.98f, 7.09f, 17.75f, 6.68f, 17.34f)
                curveTo(6.2f, 16.86f, 5.97f, 16.16f, 6.06f, 15.42f)
                lineTo(6.66f, 10.35f)
                curveTo(6.86f, 8.66f, 7.68f, 7.98f, 9.4f, 8.09f)
                lineTo(11.79f, 8.23f)
                curveTo(12.2f, 8.26f, 12.52f, 8.61f, 12.49f, 9.02f)
                curveTo(12.46f, 9.43f, 12.11f, 9.75f, 11.7f, 9.72f)
                lineTo(9.3f, 9.59f)
                curveTo(8.33f, 9.53f, 8.24f, 9.68f, 8.14f, 10.53f)
                lineTo(7.54f, 15.6f)
                curveTo(7.51f, 15.88f, 7.58f, 16.13f, 7.73f, 16.28f)
                curveTo(7.89f, 16.44f, 8.13f, 16.51f, 8.41f, 16.47f)
                lineTo(13.48f, 15.87f)
                curveTo(14.4f, 15.76f, 14.51f, 15.62f, 14.43f, 14.74f)
                lineTo(14.28f, 12.32f)
                curveTo(14.26f, 11.91f, 14.57f, 11.55f, 14.98f, 11.53f)
                curveTo(15.39f, 11.5f, 15.75f, 11.82f, 15.77f, 12.23f)
                lineTo(15.91f, 14.62f)
                curveTo(16.08f, 16.3f, 15.38f, 17.16f, 13.65f, 17.36f)
                lineTo(8.58f, 17.96f)
                curveTo(8.49f, 17.98f, 8.39f, 17.98f, 8.29f, 17.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.49f, 17.27f)
                curveTo(7.3f, 17.27f, 7.11f, 17.2f, 6.96f, 17.05f)
                curveTo(6.67f, 16.76f, 6.67f, 16.28f, 6.96f, 15.99f)
                lineTo(8.81f, 14.14f)
                curveTo(9.1f, 13.85f, 9.58f, 13.85f, 9.87f, 14.14f)
                curveTo(10.16f, 14.43f, 10.16f, 14.91f, 9.87f, 15.2f)
                lineTo(8.02f, 17.05f)
                curveTo(7.88f, 17.2f, 7.69f, 17.27f, 7.49f, 17.27f)
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

        return _PathSquare!!
    }

@Suppress("ObjectPropertyName")
private var _PathSquare: ImageVector? = null
